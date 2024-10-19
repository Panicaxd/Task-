package com.example.app.securitydemo.service;

import com.example.app.securitydemo.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save(User user);
    void updateUserRole(Long userId, String roleName);
}