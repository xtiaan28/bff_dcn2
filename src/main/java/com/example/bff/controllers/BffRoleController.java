package com.example.bff.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.bff.services.BffRoleService;

@RestController
@CrossOrigin
@RequestMapping("/bff/roles")
public class BffRoleController {
    @Autowired
    private BffRoleService bffRoleService;

    @GetMapping("/roles/{id}")
    public ResponseEntity<?> getRolesById(@PathVariable Long id) {
        return ResponseEntity.ok(bffRoleService.getRolesById(id));
    }

    @PostMapping("/graphql")
    public ResponseEntity<?> createOrGetRoles(@RequestBody Map<String, String> query) {
        return ResponseEntity.ok(bffRoleService.createOrGetRoles(query));
    }

    @PutMapping("/UpdateRole")
    public ResponseEntity<?> updateRol(@RequestBody Map<String, String> rol) {
        return ResponseEntity.ok(bffRoleService.updateRol(rol));
    }

    @DeleteMapping("/roles/{id}")
    public ResponseEntity<?> deleteRol(@PathVariable Long id) {
        return ResponseEntity.ok(bffRoleService.deleteRol(id));
    }
}
