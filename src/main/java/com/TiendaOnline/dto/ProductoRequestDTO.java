package com.TiendaOnline.dto;

public class ProductoRequestDTO {

    private String nombre;
    private String descripcion;
    private Double precio; // Cambiado a Double (Objeto) para coincidir con tu Entidad
    private Integer stock; // Cambiado a Integer (Objeto) para coincidir con tu Entidad
    private String categoria;

    public ProductoRequestDTO() {
    }

    public ProductoRequestDTO(String nombre, String descripcion, Double precio, Integer stock, String categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    // Getters y Setters corregidos
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    // CORREGIDO: Ahora devuelve Integer
    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
}