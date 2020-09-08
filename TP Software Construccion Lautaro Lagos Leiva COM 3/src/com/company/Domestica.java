package com.company;

import java.util.ArrayList;

public class Domestica extends Obra{
    private int habitaciones;

    public Domestica (String nombre, String direccion, float metrosCuadrados, float tiempo, float costo, int habitaciones)
    {
        super(nombre, direccion, metrosCuadrados, tiempo, costo);
        this.habitaciones=habitaciones;
    }


    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Habitaciones: " +habitaciones;
    }
}
