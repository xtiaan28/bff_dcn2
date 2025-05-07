package com.example.bff.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "RolesRest", url = "https://crud-roles.azurewebsites.net/api")
public interface RolesRest {

    @GetMapping("/roles/{id}")
    Object getRolesById(@PathVariable("id") Long id);

    @PostMapping("/graphql")
    Object createOrGetRoles(@RequestBody Object query);

    @PutMapping("/UpdateRole")
    String updateRol(@RequestBody Object rol);

    @DeleteMapping("/roles/{id}?code={code}")
    String deleteRol(@PathVariable("id") Long id,  @PathVariable("code") String code);

}
