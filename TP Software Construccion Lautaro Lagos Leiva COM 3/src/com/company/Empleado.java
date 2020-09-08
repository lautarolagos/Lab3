package com.company;

public class Empleado {
    private String nombre;
    private int dni;
    private int tel;
    private int costo;


    public Empleado(String nombre, int dni, int tel, int costo)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.tel = tel;
        this.costo= costo;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString()
    {
        return "Nombre: " +nombre+ " | DNI: " +dni+ " | TEL: " +tel+ " | Costo: " +costo;
    }


}
