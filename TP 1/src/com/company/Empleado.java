package com.company;

public class Empleado {
    private int dni;
    private String nombreApellido;
    private float salario;

    public Empleado(int dni, String nombreApellido, float salario) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.salario = salario;
    }


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcularSalario()
    {
        float salarioAnual = this.salario * 12;
        //System.out.println("El Salario anual es de: $ " +salarioAnual);
        return salarioAnual;

    }
    public float aumentarSalario(float porcentaje)
    {
        float porcent = porcentaje * this.salario / 100;
        this.salario=this.salario + porcent;
    return porcent;
    }
}
