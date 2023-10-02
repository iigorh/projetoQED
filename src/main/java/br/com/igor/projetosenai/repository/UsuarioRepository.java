package br.com.igor.projetosenai.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import br.com.igor.projetosenai.model.User;

public interface UsuarioRepository extends Repository<User, Long> {

	@Query("SELECT u from User u Where u.username = : username")
	public User getUserByUsername(@Param("username") String username);
	
	
}
