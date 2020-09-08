package com.company;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    ArrayList<Empleado> empleados;
    ArrayList<Obra> obras;


    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
        obras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String verObras()
    {
        StringBuilder a = new StringBuilder();
        for(Obra obra : obras)
        {
            a.append(obra.toString());
        }
        return a.toString();
    }

    public String verEmpleados()
    {
        StringBuilder a = new StringBuilder();
        for(Empleado emp : empleados)
        {
            a.append(emp.toString());
        }
        return a.toString();
    }

}
