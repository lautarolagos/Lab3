package com.company;

public abstract class Cerveza {
    private int id;
    private String nombre;
    private float precio;
    private float ABV;
    private String descripcion;

    public Cerveza(int id, String nombre, float precio, float ABV, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.ABV = ABV;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getABV() {
        return ABV;
    }

    public void setABV(float ABV) {
        this.ABV = ABV;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void calcularCostoFabricacion();

    @Override
    public String toString() {
        return "Cerveza{" + "id=" + id + ", nombre='" + nombre + '\'' + ", precio=" + precio + ", ABV=" + ABV + ", descripcion='" + descripcion + '\'' + '}';
    }
}
