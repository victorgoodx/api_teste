package com.example.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.model.AuthenticationModel;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {

    @PostMapping("/login")
    public boolean login(@RequestBody AuthenticationModel authModel) {
        return "admin".equals(authModel.getUsername()) && "admin".equals(authModel.getPassword());
    }
}



