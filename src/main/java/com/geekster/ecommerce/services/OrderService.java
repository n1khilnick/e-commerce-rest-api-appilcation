package com.geekster.ecommerce.services;

import com.geekster.ecommerce.models.Address;
import com.geekster.ecommerce.models.Order;
import com.geekster.ecommerce.models.User;
import com.geekster.ecommerce.repositories.IOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderDao orderDao;

    public void createOrder(Order order) {
        User user = order.getUser();
        Address address = order.getAddress();
        address.setUser(user);
        orderDao.save(order);
    }

    public Iterable<Order> getAllOrders() {
        return orderDao.findAll();
    }

    public Optional<Order> getOrderById(Integer orderId) {
        return orderDao.findById(orderId);
    }
}
