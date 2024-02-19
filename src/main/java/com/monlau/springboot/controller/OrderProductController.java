package com.monlau.springboot.controller;

import com.monlau.springboot.model.OrderProduct;
import com.monlau.springboot.service.OrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders-products")
public class OrderProductController {
    @Autowired
    private OrderProductService orderProductService;

    @GetMapping("/details")
    public List<OrderProduct> getAllOrderProducts() {
        return orderProductService.getAllOrderProducts();
    }



}
