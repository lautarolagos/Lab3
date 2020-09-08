package com.company;


public class Arquitecto extends Empleado {
    private int matricula;

    public Arquitecto (String nombre, int dni, int tel, int costo, int matricula)
    {
        super(nombre, dni, tel, costo);
        this.matricula=matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String crearPlanos()
    {
        return "Creando mi proximo plano";
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Matricula: " +matricula+ " | ARQUITECTO \n";
    }
}
