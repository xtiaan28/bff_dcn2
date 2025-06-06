package com.example.bff.services.impl;

import com.example.bff.restclients.ClientRest;
import com.example.bff.services.BffAzureService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BffAzureServiceImpl implements BffAzureService {
    @Autowired
    private ClientRest clientRest;

    public List<Object> getAllUsers() {
        return clientRest.getAllUsers();
    }

    public Object getUserById(Long id) {
        return clientRest.getUserById(id);
    }

    public Object createUser(Map<String, String> user) {
        return clientRest.createUser(user);
    }

    public Object CreateUserWithDefaultRole(Map<String, String> user) {
        return clientRest.CreateUserWithDefaultRole(user);
    }
    
    public Object updateDeleteUser(Map<String, String> query) {
        return clientRest.updateDeleteUser(query);
    }

}
