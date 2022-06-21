package com.marcosfc.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosfc.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
