package com.example.bff.services;

import java.util.List;
import java.util.Map;

public interface BffAzureService {

    List<Object> getAllUsers();

    Object getUserById(Long id);

    Object createUser(Map<String, String> user);

    Object CreateUserWithDefaultRole(Map<String, String> user);

    Object updateDeleteUser(Map<String, String> query);

}
