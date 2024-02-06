package com.monlau.springboot.service;

import com.monlau.springboot.model.OrderProduct;
import com.monlau.springboot.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductService {

    @Autowired
    private OrderProductRepository orderProductRepository;

    public List<OrderProduct> getAllOrderProducts() {
        return orderProductRepository.findAll();
    }
}
