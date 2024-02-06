package com.monlau.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Table(name = "orders")
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Timestamp date_order;

        @ManyToMany
        @JoinTable(
                name = "order_product",
                joinColumns = @JoinColumn(name = "order_id"),
                inverseJoinColumns = @JoinColumn(name = "product_id")
        )
        public Set<Product> products = new HashSet<>();
}
