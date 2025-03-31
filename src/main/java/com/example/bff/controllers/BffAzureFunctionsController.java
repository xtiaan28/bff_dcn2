package com.example.bff.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bff.services.BffAzureService;

@RestController
@CrossOrigin
@RequestMapping("/bff")
public class BffAzureFunctionsController {
    @Autowired
	private BffAzureService bffService;

    @GetMapping("/GetUsers")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(bffService.getAllUsers());
    }
    @PostMapping("/CreateUser")
    public ResponseEntity<?> createUser(@RequestBody Map<String, String> user) {
        return ResponseEntity.ok(bffService.createUser(user));
    }
}