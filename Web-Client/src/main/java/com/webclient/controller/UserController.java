package com.webclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webclient.model.UserResponse;
import com.webclient.service.UserService;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/fetch-users")
    public UserResponse fetchUsers() {
        return userService.fetchUsers();
    }
}

