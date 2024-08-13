package com.example.ddd.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
public interface BaseAPI {
    @GetMapping("/status")
    default String status() {
        return "API is up and running";
    }
}
