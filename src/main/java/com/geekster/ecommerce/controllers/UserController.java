package com.geekster.ecommerce.controllers;

import com.geekster.ecommerce.models.Order;
import com.geekster.ecommerce.models.User;
import com.geekster.ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/")
    public void addUser(@RequestBody User user){
        userService.createUser(user);
    }

    @GetMapping(value = "/")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{userId}")
    public Optional<User> getUserById(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

}
