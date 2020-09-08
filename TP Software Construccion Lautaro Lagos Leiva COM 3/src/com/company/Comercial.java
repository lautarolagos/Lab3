package com.company;

import java.util.ArrayList;

public class Comercial extends Obra {
    private String nombreObra;

    public Comercial (String nombre, String direccion, float metrosCuadrados, float tiempo, float costo, String nombreObra)
    {
        super(nombre, direccion, metrosCuadrados, tiempo, costo);
        this.nombreObra=nombreObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Nombre Obra: " +nombreObra;
    }
}