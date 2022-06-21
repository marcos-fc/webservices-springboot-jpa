package com.marcosfc.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosfc.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
