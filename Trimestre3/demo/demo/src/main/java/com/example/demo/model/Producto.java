package com.example.demo.model;

import jakarta.persistence.*;

@Entity // Esto le dice a Spring: "Crea una tabla con esta clase"
@Table(name = "productos")
public class Producto {
    @Id // Define la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double precio;
    private String imagen;

    // Constructor vacío
    public Producto() {}

    // Constructor con parámetros
    public Producto(int id, String name, double precio, String imagen) {
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.imagen = imagen;
    }

    // Getters y Setters (Necesarios para que Spring cree el JSON)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}