package com.TiendaOnline.dto;

public class ProductoResponseDTO {
    private Long id;
    private String nombre;
    private int stock;

    public ProductoResponseDTO() {
    }

    public ProductoResponseDTO(Long id, String nombre, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

}
