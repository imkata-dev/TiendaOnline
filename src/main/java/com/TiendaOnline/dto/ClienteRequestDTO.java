package com.TiendaOnline.dto;

public class ClienteRequestDTO {

    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String direccion;

    // Constructor vacío (Obligatorio para que Spring pueda procesarlo)
    public ClienteRequestDTO() {
    }

    // Constructor con parámetros
    public ClienteRequestDTO(String nombre, String apellido, String correo, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {  // ✅ Corregido
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}