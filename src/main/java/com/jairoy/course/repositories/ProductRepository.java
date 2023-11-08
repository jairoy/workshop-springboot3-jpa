package com.jairoy.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jairoy.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {	

}
