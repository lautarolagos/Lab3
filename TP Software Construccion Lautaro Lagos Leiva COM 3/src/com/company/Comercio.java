package com.company;

import java.util.ArrayList;

public class Comercio extends Comercial {
    private String rubro;

    public Comercio(String direccion, float metrosCuadrados, float tiempo, float costo, String nombre, String rubro) {
        super(nombre, direccion, metrosCuadrados, tiempo, costo, nombre);
        this.rubro=rubro;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Rubro: " +rubro;
    }
}
