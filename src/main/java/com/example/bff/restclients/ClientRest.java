package com.example.bff.restclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ClientRest", url = "https://crud-users.azurewebsites.net/api")
public interface ClientRest {

    @GetMapping("/GetUsers")
    List<Object> getAllUsers();

    @GetMapping("/users/{id}")
    Object getUserById(@PathVariable("id") Long id);

    @PostMapping("/CreateUser")
    Object createUser(@RequestBody Object user);

    @PostMapping("/graphql-users")
    Object updateDeleteUser(@RequestBody Object user);
}
