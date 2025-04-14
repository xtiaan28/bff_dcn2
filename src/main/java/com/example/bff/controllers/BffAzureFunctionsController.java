package com.example.bff.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.bff.services.BffAzureService;

@RestController
@CrossOrigin
@RequestMapping("/bff/users")
public class BffAzureFunctionsController {
    @Autowired
    private BffAzureService bffService;
    

    @GetMapping("/GetUsers")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(bffService.getAllUsers());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(bffService.getUserById(id));
    }

    @PostMapping("/CreateUser")
    public ResponseEntity<?> createUser(@RequestBody Map<String, String> user) {
        return ResponseEntity.ok(bffService.createUser(user));
    }

    @PostMapping("/graphql-users")
    public ResponseEntity<?> updateDeleteUser(@RequestBody Map<String, String> query) {
        return ResponseEntity.ok(bffService.updateDeleteUser(query));
    }
}