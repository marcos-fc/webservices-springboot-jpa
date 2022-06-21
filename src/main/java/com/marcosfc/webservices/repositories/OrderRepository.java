package com.marcosfc.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosfc.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
