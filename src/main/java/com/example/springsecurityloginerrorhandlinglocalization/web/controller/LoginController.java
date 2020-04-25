package com.example.springsecurityloginerrorhandlinglocalization.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class LoginController {

    @GetMapping(value="/login")
    public String logString(@RequestParam(required = false) String param) {
        return "login";
    }

    @PostMapping(value="/login")
    public String postMethodName(@RequestBody(required = false) String entity) {
       return entity;
    }
    
    
}