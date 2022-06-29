package com.marcosfc.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosfc.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
