package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Empresa {

    private int tarifaxPersona;
    private String nombre;
    private int edad;
    private int dni;
    private String apellido;
    ArrayList<Cuestionario> historialVuelos;

    public Usuario(){
        tarifaxPersona=0;
        nombre="";
        edad=0;
        apellido="";
        dni=0;
    }
    public Usuario(String nombre, int edad, int dni, String apellido) {
        this.tarifaxPersona = 3500;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
        historialVuelos = new ArrayList<>();
    }

    public String verHistorial() // Era de tipo Avion pero la cambie por una de tipo "Reserva" ya que ahi van los datos .-Lautaro
    {
        int i=0;
        StringBuilder a = new StringBuilder();
        for(Cuestionario cuestionario : historialVuelos)
        {
            if (historialVuelos.get(i).getVueloCancelado() == 0){
                a.append(cuestionario.toString());
            }
            i++;
        }
        return a.toString();
    }

    public Usuario buscarUsuarios(ArrayList<Usuario> s,int dni){   //busca y retorna un usuario -Ariel y tommy
        int i=0;
        int d=s.size();
        Usuario usuario= new Usuario();
        while (i<d){
            if(s.get(i).getDni()==dni){
                usuario = s.get(i);
            }
            i++;
        }

        return usuario;
    }

    public int calculototal (){ //en teoria recorre la list sumando todos los costos -Tommy
        int rta=0;
        Cuestionario aux;

        for (int i=0; i < historialVuelos.size(); i++){
            aux=historialVuelos.get(i);
            rta += aux.getCostoVuelo();

        }

        return rta;
    }

    public void CancelarVuelo (Empresa e){
        Scanner scan = new Scanner(System.in);
        int id=0, id2=0;
        Avion a = new Avion();

        System.out.println("ingrese la Id del vuelo que desea cancelar: ");
        id=scan.nextInt();

        for (int i=0; i < historialVuelos.size(); i++){
            if(historialVuelos.get(i).getIdContrato() == id){
                id2 =historialVuelos.get(i).getIdAvion();
                a=a.getAvionPorid(id2,e.aviones);
                a.setCancelado(1);
                historialVuelos.get(i).setVueloCancelado(1);
            }

        }

    }

    public int getTarifaxPersona() {
        return tarifaxPersona;
    }

    public void setTarifaxPersona(int tarifaxPersona) {
        this.tarifaxPersona = tarifaxPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }





}
