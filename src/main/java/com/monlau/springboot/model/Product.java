package com.monlau.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Table(name = "products")
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Product {

    @Id
    private Integer id;
    private String name;
    private String description;
    private float price;
    private int stock;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "order_product",
            joinColumns = {
                @JoinColumn(name = "product_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "order_id", referencedColumnName = "id")
            })
    private Set<Order> orders;
}
