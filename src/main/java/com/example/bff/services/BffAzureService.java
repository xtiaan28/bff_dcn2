package com.example.bff.services;

import java.util.List;
import java.util.Map;

public interface BffAzureService {
    
    List<Object> getAllUsers();

    Object createUser(Map<String, String> user);


}
