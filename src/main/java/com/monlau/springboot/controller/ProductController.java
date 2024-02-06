package com.monlau.springboot.controller;


import com.monlau.springboot.model.Product;
import com.monlau.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.monlau.springboot.repository.ProductRepository;
import com.monlau.springboot.repository.OrderRepository;

import java.util.List;


@RestController
@RequestMapping("/api/v1/products")
public class ProductOrderController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
