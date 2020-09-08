package com.company;

public class Maestro extends Empleado implements Trabajo{
    private int edad;

    public Maestro (String nombre, int dni, int tel, int costo, int edad)
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
        return "Soy maestro y superviso las construcciones";
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Edad: " +edad+ " | MAESTRO MAYOR DE OBRA\n";
    }
}
