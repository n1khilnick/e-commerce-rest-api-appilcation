package com.geekster.ecommerce.services;

import com.geekster.ecommerce.models.User;
import com.geekster.ecommerce.repositories.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserDao userDao;

    public void createUser(User user) {
        userDao.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userDao.findAll();
    }

    public Optional<User> getUserById(Integer userId) {
        return userDao.findById(userId);
    }
}
