package br.com.program.softv1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.program.softv1.model.User;

public interface UserRepository extends JpaRepository<User, String>{
	UserDetails findByLogin(String login);
}
