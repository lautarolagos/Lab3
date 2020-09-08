package com.company;


public class Hotel extends Comercial {
    private int pisos;

    public Hotel(String nombre, String direccion, float metrosCuadrados, float tiempo, float costo, String nombreObra, int pisos) {
        super(nombre, direccion, metrosCuadrados, tiempo, costo, nombreObra);
        this.pisos=pisos;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Pisos: " +pisos;
    }
}
