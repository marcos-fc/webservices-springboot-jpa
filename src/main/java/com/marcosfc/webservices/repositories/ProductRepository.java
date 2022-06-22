package com.marcosfc.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosfc.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
