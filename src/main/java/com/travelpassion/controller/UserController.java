package com.travelpassion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelpassion.model.user;
import com.travelpassion.repository.UserRepository;

@RestController
@RequestMapping("/api/users")

public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

}
