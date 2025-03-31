package com.example.bff.restclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

                                       //https://funcionesg14-dkf7abbphkedhedc.eastus2-01.azurewebsites.net/api/CreateUser?
@FeignClient(name = "ClientRest", url = "https://funcionesg14-dkf7abbphkedhedc.eastus2-01.azurewebsites.net/api")
public interface ClientRest {

    @GetMapping("/GetUsers")
    List<Object> getAllUsers();

    @PostMapping("/CreateUser")
    Object createUser(@RequestBody Object user);

}
