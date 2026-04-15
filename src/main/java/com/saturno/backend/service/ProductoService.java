package com.saturno.backend.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    private List<Producto> productos = new ArrayList<>();

    public static class Producto {
        public String nombre;
        public double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    public List<Producto> listarProductos() {
        return productos;
    }

    public String agregarProducto(String nombre, double precio) {
        productos.add(new Producto(nombre, precio));
        return "Producto agregado correctamente";
    }
}