package com.company;

public class Rubia extends TipoCerveza{
    public Rubia(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta, float porcentajeComplejidad) {
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
