package com.example.app.securitydemo.controller;

import com.example.app.securitydemo.model.User;
import com.example.app.securitydemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;

    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String adminPage() {
        return "<h1>Hello Admin</h1><a href='/admin-page'>Go to Admin Page</a>";
    }

    @GetMapping("/admin-page")
    public List<User> adminPageForRoleManagement() {
        return userService.findAll();
    }

    @PostMapping("/update-role")
    public String updateRole(@RequestParam Long userId, @RequestParam String roleName) {
        userService.updateUserRole(userId, roleName);
        return "Role updated successfully";
    }
}