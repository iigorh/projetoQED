package br.com.igor.projetosenai.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.igor.projetosenai.model.User;
import br.com.igor.projetosenai.repository.UsuarioRepository;



public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository userRepository;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.getUserByUsername(username);
		if(user==null) {
				throw new UsernameNotFoundException("Não foi encontrado o usuário");
		}
		return new MyUserDetail(user);
	}

}
