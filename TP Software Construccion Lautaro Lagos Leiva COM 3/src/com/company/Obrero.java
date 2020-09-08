package com.company;

public class Obrero extends Empleado implements Trabajo{
    private int edad;

    public Obrero (String nombre, int dni, int tel, int costo, int edad)
    {
        super(nombre, dni, tel, costo);
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String construir() {
        return "Soy obrero y construyo";
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Edad: " +edad+ " | OBRERO\n";
    }
}
