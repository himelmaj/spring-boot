package com.monlau.springboot.repository;
import com.monlau.springboot.model.Product;
import com.monlau.springboot.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
