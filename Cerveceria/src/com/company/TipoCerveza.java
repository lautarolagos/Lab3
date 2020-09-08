package com.company;

public abstract class TipoCerveza extends Cerveza{
    private boolean gluten;
    private Receta receta;
    private float porcentajeComplejidad;

    public TipoCerveza(int id, String nombre, float precio, float ABV, String descripcion, boolean gluten, Receta receta, float porcentajeComplejidad) {
        super(id, nombre, precio, ABV, descripcion);
        this.gluten = gluten;
        this.receta = receta;
        this.porcentajeComplejidad = porcentajeComplejidad;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public float getPorcentajeComplejidad() {
        return porcentajeComplejidad;
    }

    public void setPorcentajeComplejidad(float porcentajeComplejidad) {
        this.porcentajeComplejidad = porcentajeComplejidad;
    }

    public void fabricarConSinGluten(Receta re, boolean gluten)
    {

    }

    public abstract void calcularCostoFabricacion();

    @Override
    public String toString() {
        return "TipoCerveza{" + "gluten=" + gluten + ", porcentajeComplejidad=" + porcentajeComplejidad + '}';
    }
}
