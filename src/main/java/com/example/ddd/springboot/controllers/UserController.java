package com.example.ddd.springboot.controllers;

import com.example.ddd.springboot.domain.dto.UserDTO;
import com.example.ddd.springboot.services.UserService;
import com.example.ddd.springboot.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user.getUsername(), user.getPassword(), user.getEmail());
        UserDTO response = new UserDTO("User created", createdUser.getId().toString(), createdUser.getUsername(), createdUser.getEmail());
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
