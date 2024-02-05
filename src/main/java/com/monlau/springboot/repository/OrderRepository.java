package com.monlau.springboot.repository;
import com.monlau.springboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
public interface OrderRepository extends JpaRepository<Order, Long> {
}
