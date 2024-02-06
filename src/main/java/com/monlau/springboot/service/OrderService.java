package com.monlau.springboot.service;


import com.monlau.springboot.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.monlau.springboot.repository.OrderRepository;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
