package com.monlau.springboot.controller;


import com.monlau.springboot.model.Order;
import com.monlau.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders/")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        List<Order> orders = orderService.list();
        return orderService.list();
    }

    @GetMapping("{id}")
    public Order getOrderById(@PathVariable Integer id) {
        return orderService.findOrderById(id);
    }

    @PostMapping
    public void addOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
    }

    @PutMapping("{id}")
    public void updateOrder(@PathVariable Integer id, @RequestBody Order order) {
        orderService.saveOrder(order);
    }

    @DeleteMapping("{id}")
    public void deleteOrder(@PathVariable Integer id) {
        orderService.deleteOrder(id);
    }


}
