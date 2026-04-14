package com.saturno.backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    // Lista de productos (simulada)
    private List<Producto> productos = new ArrayList<>();

    // Clase interna Producto
    static class Producto {
        public String nombre;
        public double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    // Listar productos
    @GetMapping
    public List<Producto> listarProductos() {
        return productos;
    }

    // Agregar producto
    @GetMapping("/agregar")
    public String agregarProducto(
            @RequestParam String nombre,
            @RequestParam double precio) {

        productos.add(new Producto(nombre, precio));
        return "Producto agregado correctamente";
    }
}