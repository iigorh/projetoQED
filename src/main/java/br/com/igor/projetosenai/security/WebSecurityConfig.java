package br.com.igor.projetosenai.security;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.ExceptionHandlingConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig{
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImpl();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvicer() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService());
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}
	
	
		
		protected void configure(AuthenticationManagerBuilder auth) throws Exception{
			auth.authenticationProvider(authenticationProvicer());
		}
	    public void configure(HttpSecurity http) throws Exception {
	      
	    	http

	    		   .authorizeHttpRequests(auth -> auth
	        		.requestMatchers("/").hasAnyAuthority("USER", "CREATOR", "EDITOR", "ADMIN")
	                .requestMatchers("/new").hasAnyAuthority("ADMIN", "CREATOR")
	                .requestMatchers("/edit/**").hasAnyAuthority("ADMIN", "EDITOR")
	                .requestMatchers("/delete/**").hasAnyAuthority("ADMIN")
	                .requestMatchers("/h2-console/**").permitAll()
	                .anyRequest().authenticated()
	                        )
	    		   
	    		   .httpBasic()
	    		   .and()
	                .formLogin().permitAll()
	                .and()
	                .logout().permitAll()
	                .and()
	        		.exceptionHandling().accessDeniedPage("/403")
	               ;

	               
	    }
	 	 

}
