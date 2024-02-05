package com.monlau.springboot.service;

import com.monlau.springboot.model.Order;
import com.monlau.springboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> list(){
        return orderRepository.findAll();
    }

    public void saveOrder(Order order){
        orderRepository.save(order);
    }
    public Order findOrderById(Integer id){
        return orderRepository.findById(id).get();
    }
    public void deleteOrder(Integer id){
        orderRepository.deleteById(id);
    }
}
