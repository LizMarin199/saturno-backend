package com.saturno.backend.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    private Map<String, String> usuarios = new HashMap<>();

    // Registrar usuario
    public String registro(String usuario, String password) {
        usuarios.put(usuario, password);
        return "Usuario registrado correctamente";
    }

    // Login
    public String login(String usuario, String password) {
        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(password)) {
            return "Autenticación satisfactoria";
        } else {
            return "Error en la autenticación";
        }
    }
}
