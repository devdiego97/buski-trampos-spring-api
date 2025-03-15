package com.diegodev.buskitrampos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
    

    @GetMapping()
    public String getAllUsers(){
       return "lista de usuários";
    }
}
