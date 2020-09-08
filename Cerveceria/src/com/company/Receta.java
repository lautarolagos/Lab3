package com.company;

import java.util.ArrayList;

public class Receta {
    private int id;
    private String nombre;
    private String pais;
    ArrayList <Ingrediente> listaIngredientes;

    public Receta(int id, String nombre, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        listaIngredientes = new ArrayList<>();
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void agregarIngredientes(Ingrediente ingrediente)
    {
        listaIngredientes.add(ingrediente);
    }

    public void quitarIngredientes(int id)
    {
        int indice;
        indice = listaIngredientes.indexOf(id);
        if(indice != -1)
        {
            listaIngredientes.remove(indice);
            System.out.println("Ingrediente quitado con exito");
        }
        else{
            System.out.println("No se puedo quitar el ingrediente");
        }
    }

    @Override
    public String toString() {
        return "Receta{" + "id=" + id + ", nombre='" + nombre + '\'' + ", pais='" + pais;
    }
}
