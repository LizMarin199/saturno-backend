package com.saturno.backend.controller;

import com.saturno.backend.service.PedidoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/crear")
    public String crearPedido(
            @RequestParam String producto,
            @RequestParam int cantidad) {

        return pedidoService.crearPedido(producto, cantidad);
    }
}