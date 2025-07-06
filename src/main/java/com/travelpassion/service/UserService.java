package com.travelpassion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelpassion.model.user;
import com.travelpassion.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public java.util.List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public user addUser(user user) {
        return userRepository.save(user);
    }

}
