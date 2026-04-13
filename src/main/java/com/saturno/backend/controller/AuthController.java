package com.saturno.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private String usuarioGuardado = "admin";
    private String passwordGuardado = "1234";

    @GetMapping("/registro")
    public String registrar(@RequestParam String usuario, @RequestParam String password) {
        usuarioGuardado = usuario;
        passwordGuardado = password;
        return "Usuario registrado correctamente";
    }

    @GetMapping("/login")
    public String login(@RequestParam String usuario, @RequestParam String password) {
        if (usuario.equals(usuarioGuardado) && password.equals(passwordGuardado)) {
            return "Autenticación satisfactoria";
        } else {
            return "Error en la autenticación";
        }
    }
}