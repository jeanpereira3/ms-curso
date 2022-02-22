package com.jean.projeto.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jean.projeto.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
