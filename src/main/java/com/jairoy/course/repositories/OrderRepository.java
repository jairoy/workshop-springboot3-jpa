package com.jairoy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jairoy.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {	

}
