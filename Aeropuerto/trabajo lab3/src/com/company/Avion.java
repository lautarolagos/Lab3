package com.company;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Avion extends Empresa{
    private int capacidadDeCombustible;
    private int costoPorKM;
    private int capacidadMaxDePasajeros;
    private int velocidadMaxima;
    private int tipoDePropulsor;   //lo cambie por un int y con un metodo determine cual es dependiendo de si es 1 2 o 3 (falta el metodo).-Tommy
    private int idAvion;           // Esto va a servir para poder identificar el avion cuando se esta haciendo el cuestionario y otras cosas
    private int tarifaTipoAvion;
    private int cancelado;         //Si es 1 el vuelo esta cancelado, valor por defecto = 0 -Tommy


     Usuario usuario;


    public Avion() {
    }

    public Avion(int capacidadDeCombustible, int capacidadMaxDePasajeros, int velocidadMaxima, int tarifaTipoAvion) {
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.costoPorKM = ThreadLocalRandom.current().nextInt(150,300+1); //en teoria esto deberia ser un rand entre 150 y 300 -Tommy
        this.capacidadMaxDePasajeros = capacidadMaxDePasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoDePropulsor = ThreadLocalRandom.current().nextInt(1,3+1);
        this.tarifaTipoAvion = tarifaTipoAvion;
        this.cancelado = 0;

    }

    public Avion crearAvionRand (){                                      //en teoria esto crea un avion con valores aleatorios -Tommy
        Gold g = new Gold();
        Silver s = new Silver();
        Bronze b = new Bronze();
        int i=ThreadLocalRandom.current().nextInt(1,3+1);       //dependiendo de este rand va a ser de un tipo o de otro (gold, Silver o Bronze) -Tommy

        if (i==1){
            g.setCapacidadDeCombustible(ThreadLocalRandom.current().nextInt(700,2200+1));
            g.setCapacidadMaxDePasajeros(ThreadLocalRandom.current().nextInt(1,20+1));
            g.setCostoPorKM(ThreadLocalRandom.current().nextInt(150,300+1));
            g.setTipoDePropulsor(ThreadLocalRandom.current().nextInt(1,3+1));
            g.setVelocidadMaxima(ThreadLocalRandom.current().nextInt(400,1000+1));
            g.setTarifaTipoAvion(6000);
            g.setCatering(Math.random() <0.5);
            g.setWifi(Math.random() <0.5);
            g.setIdAvion(crearId());
            g.setCancelado(0);
            return g;
        }else if (i==2){
            s.setCapacidadDeCombustible(ThreadLocalRandom.current().nextInt(700,2200+1));
            s.setCapacidadMaxDePasajeros(ThreadLocalRandom.current().nextInt(1,20+1));
            s.setCostoPorKM(ThreadLocalRandom.current().nextInt(150,300+1));
            s.setTipoDePropulsor(ThreadLocalRandom.current().nextInt(1,3+1));
            s.setVelocidadMaxima(ThreadLocalRandom.current().nextInt(400,1000+1));
            s.setCatering(Math.random() <0.5);
            s.setIdAvion(crearId());
            s.setCancelado(0);
            return s;
        }else {
            b.setCapacidadDeCombustible(ThreadLocalRandom.current().nextInt(700,2200+1));
            b.setCapacidadMaxDePasajeros(ThreadLocalRandom.current().nextInt(1,20+1));
            b.setCostoPorKM(ThreadLocalRandom.current().nextInt(150,300+1));
            b.setTipoDePropulsor(ThreadLocalRandom.current().nextInt(1,3+1));
            b.setVelocidadMaxima(ThreadLocalRandom.current().nextInt(400,1000+1));
            b.setIdAvion(crearId());
            b.setCancelado(0);
            return b;

        }

    }

    public int crearId (){                  //crea una id para los aviones -Tommy
        int i=0;

        for (Avion avion : aviones){
            i++;
        }

        return i;
    }

    public Avion getAvionPorid (int id, ArrayList<Avion> aviones){       //busca el avion por id -Tommy
        Avion a =new Avion();
        Avion aux = new Avion();                  //tira warning diciendo que es redundante pero si saco el new avion tira error xd -Tommy

        for (int i=0;i < aviones.size(); i++){
            aux = aviones.get(i);  // estoy seguro de que esto esta mal
            if (id == aux.getIdAvion() ){
                a=aux;
            }
        }

        return a;
    }

    public String mostrarTipoavion (Usuario u, Empresa e){          //muestra el tipo de avion mas alto -Tommy
        int j=0;
        int id= 0;
        Avion a = new Avion();
        String aux = new String();
        Cuestionario c = new Cuestionario();

        for(int i=0;i<u.historialVuelos.size();i++)
        {
            c= u.historialVuelos.get(i);              //algo me dice que estas 3 lineas estan mal -Tommy
            id= c.getIdAvion();
            a=getAvionPorid(id, e.aviones);

            if (a instanceof Bronze && j<=1){
                j=1;
            }else if (a instanceof Silver && j<=2){
                j=2;
            }else if (a instanceof Gold && j<=3){
                j=3;
            }
        }

        if (j == 1){
            aux= "Bronze";
        }else if (j == 2){
            aux= "Silver";
        }else if (j == 3){
            aux= "Gold";
        }

        return aux;
    }

    public int getCapacidadDeCombustible() {
        return capacidadDeCombustible;
    }

    public void setCapacidadDeCombustible(int capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
    }

    public int getCostoPorKM() {
        return costoPorKM;
    }

    public void setCostoPorKM(int costoPorKM) {
        this.costoPorKM = costoPorKM;
    }

    public int getCapacidadMaxDePasajeros() {
        return capacidadMaxDePasajeros;
    }

    public void setCapacidadMaxDePasajeros(int capacidadMaxDePasajeros) {
        this.capacidadMaxDePasajeros = capacidadMaxDePasajeros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getTipoDePropulsor() {
        return tipoDePropulsor;
    }

    public void setTipoDePropulsor(int tipoDePropulsor) {
        this.tipoDePropulsor = tipoDePropulsor;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }
    public int getTarifaTipoAvion() {
        return tarifaTipoAvion;
    }

    public void setTarifaTipoAvion(int tarifaTipoAvion) {
        this.tarifaTipoAvion = tarifaTipoAvion;
    }

    @Override
    public String toString() {
        return "Capacidad combustible: " + capacidadDeCombustible + " | Costo por km: " + costoPorKM + " | Max pasajeros: " + capacidadMaxDePasajeros + " | Velocidad max: " + velocidadMaxima + " | Tipo de propulsor: " + tipoDePropulsor + " | Id del avion :" + idAvion;
    }


    public int getCancelado() {
        return cancelado;
    }

    public void setCancelado(int cancelado) {
        this.cancelado = cancelado;
    }
}