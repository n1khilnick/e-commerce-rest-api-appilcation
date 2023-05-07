package com.geekster.ecommerce.controllers;

import com.geekster.ecommerce.models.Order;
import com.geekster.ecommerce.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping(value = "/")
    public void addService(@RequestBody Order order){
        orderService.createOrder(order);
    }

    @GetMapping(value = "/")
    public Iterable<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping(value = "/{orderId}")
    public Optional<Order> getOrderById(@PathVariable Integer orderId){
        return orderService.getOrderById(orderId);
    }

}
