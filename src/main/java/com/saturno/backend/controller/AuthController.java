package com.saturno.backend.controller;

import com.saturno.backend.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/registro")
    public String registro(
            @RequestParam String usuario,
            @RequestParam String password) {

        return authService.registro(usuario, password);
    }

    @GetMapping("/login")
    public String login(
            @RequestParam String usuario,
            @RequestParam String password) {

        return authService.login(usuario, password);
    }
}