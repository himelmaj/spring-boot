package com.monlau.springboot.service;

import com.monlau.springboot.model.Product;
import com.monlau.springboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> list(){
        return productRepository.findAll();
    }

    public void saveProduct(Product product){
        productRepository.save(product);
    }
    public Product findProductById(Integer id){
        return productRepository.findById(id).get();
    }
    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }

}
