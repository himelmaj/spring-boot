package com.monlau.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table(name = Product.TABLE_NAME)
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Product {
    public static final String TABLE_NAME= "products";

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_gen")
    @SequenceGenerator(name = "product_gen", sequenceName = "hibernate_sequence", allocationSize=1)
    @Id
    private Integer id;
    private String name;
    private float price;


}
