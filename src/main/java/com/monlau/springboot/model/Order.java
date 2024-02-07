package com.monlau.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Table(name = "orders")
@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Timestamp date_order;

        @OneToMany(mappedBy = "order")
        @JsonIgnore
        public Set<OrderProduct> orderProducts = new HashSet<>();
}
