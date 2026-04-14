package com.saturno.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @GetMapping("/crear")
    public String crearPedido(
            @RequestParam String producto,
            @RequestParam int cantidad) {

        return "Pedido creado: " + producto + " x" + cantidad;
    }
}