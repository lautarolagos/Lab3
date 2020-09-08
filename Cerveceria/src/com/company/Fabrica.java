package com.company;

import java.util.ArrayList;

public class Fabrica {
    private int id;
    private String nombre;
    private String direccion;
    ArrayList <Cerveza> listaCervezas;


    public Fabrica(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        listaCervezas = new ArrayList<>();
    }

    public Fabrica() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarCerveza()
    {

    }

    public void quitarCerveza()
    {

    }

    public void listarCervezas()
    {

    }

    @Override
    public String toString() {
        return "Fabrica{" + "id=" + id + ", nombre='" + nombre + '\'' + ", direccion='" + direccion + '\'' + '}';
    }
}
