package com.example.bff.services.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.bff.restclients.RolesRest;
import com.example.bff.services.BffRoleService;

@Service
public class BffRoleServiceImpl implements BffRoleService {
    @Autowired
    private RolesRest rolesRest;

    public Object getRolesById(Long id) {
        return rolesRest.getRolesById(id);
    }

    public Object createOrGetRoles(Map<String, String> query) {
        return rolesRest.createOrGetRoles(query);
    }

    public String updateRol(Map<String, String> rol) {
        return rolesRest.updateRol(rol);
    }

    @Value("${azure.roles.function.key}")
    private String functionKey;

    public String deleteRol(Long id) {
        return rolesRest.deleteRol(id, functionKey);
    }
}
