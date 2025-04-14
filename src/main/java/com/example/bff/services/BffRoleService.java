package com.example.bff.services;

import java.util.Map;

public interface BffRoleService {
    
    Object getRolesById(Long id);

    Object createOrGetRoles(Map<String, String> query);

    Object updateRol(Long id, Map<String, String> rol);

    Object deleteRol(Long id);
}
