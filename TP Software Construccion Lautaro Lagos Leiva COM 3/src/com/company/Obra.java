package com.company;

import java.util.ArrayList;

public class Obra extends Empresa{
    private String direccion;
    private float metrosCuadrados;
    private float tiempo;
    private float costo; // Costo por metro cuadrado
    ArrayList <Empleado> empleados;


    public Obra(String nombre, String direccion, float metrosCuadrados, float tiempo, float costo) {
        super(nombre);
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.tiempo = tiempo;
        this.costo = costo;
        empleados = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String mostrarEmpleados() // Muestra los empleados de la obra
    {
        StringBuilder a = new StringBuilder();
        for(Empleado empleado : empleados)
        {
            a.append(empleado.toString());
        }
        return a.toString();
    }

    public float calcularCosto()
    {
        int costoEmpleados=0;
        float costoTotal=0;
        for(Empleado empleado : empleados)
        {
            costoEmpleados=empleado.getCosto() + costoEmpleados;
        }
        costoTotal=(costo*metrosCuadrados)+(costoEmpleados*tiempo);
        return costoTotal;
    }

    @Override
    public String toString()
    {
        return "Direccion: " +direccion+ " | metros cuadrados: " +metrosCuadrados+ " | Tiempo estimado: " +tiempo+ " | Costo: " +costo;
    }

}
