package com.company;

public class Roja extends TipoCerveza{
    public Roja(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(id, nombre, precio, ABV, descripcion, gluten, receta, porcentajeComplejidad);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void calcularCostoFabricacion() {

    }
}
