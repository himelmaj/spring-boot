package com.monlau.springboot.controller;

import com.monlau.springboot.model.Product;
import com.monlau.springboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        List<Product> products = productService.list();
        return productService.list();
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable Integer id) {
        return productService.findProductById(id);
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @PutMapping("{id}")
    public void updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        productService.saveProduct(product);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }
}
