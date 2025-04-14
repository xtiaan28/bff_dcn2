package com.example.bff.services;

import java.util.Map;

public interface BffRoleService {
    
    Object getRolesById(Long id);

    Object createOrGetRoles(Map<String, String> query);

    String updateRol(Map<String, String> rol);

    String deleteRol(Long id);
}
