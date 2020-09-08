package com.company;
public class Bronze extends Avion {


    public Bronze() {
    }

    public Bronze(int capacidadDeCombustible, int capacidadMaxDePasajeros, int velocidadMaxima) {
        super(capacidadDeCombustible, capacidadMaxDePasajeros, velocidadMaxima, 3000);
    }

    @Override
    public String toString()
    {
        return super.toString() + " | BRONZE \n";
    }
}
