package com.saturno.backend.service;

import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    public String crearPedido(String producto, int cantidad) {
        return "Pedido creado: " + producto + " x" + cantidad;
    }
}
