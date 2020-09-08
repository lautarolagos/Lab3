package com.company;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Usuario pasarArchivoAArrayUsuarios(File f){
        ObjectMapper mapper = new ObjectMapper();
        Usuario A=new Usuario();
        try{
            A= mapper.readValue(f,Usuario.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return A;
    }
    public static void pasarArryUsuarioAFile(File f,Usuario user){//Esto iria dentro de una funcion
        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(f,user);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Avion pasarArchivoAArrayAviones(File f){
        ObjectMapper mapper = new ObjectMapper();
        Avion A=new Avion();
        try{
            A= mapper.readValue(f,Avion.class);
            return A;
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return A;
    }
    public static void pasarArryAvionesAFile(File f,Avion a){//Esto iria dentro de una funcion
        ObjectMapper mapper=new ObjectMapper();
        try {
            mapper.writeValue(f,a);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void ArrayAvionesToFile(String nombre,ArrayList<Avion> s){
        File f=new File(nombre);
        int i=0;
        int max=s.size();
        if(f.canWrite()==false){
            f.setWritable(true);
        }
        while (i<max){
            pasarArryAvionesAFile(f,s.get(i));
            i++;
        }
    }
    public static void ArrayUsuariosToFile(String nombre,ArrayList<Usuario> s){
        File f=new File(nombre);
        int i=0;
        int max=s.size();
        if(f.canWrite()==false){
            f.setWritable(true);
        }
        while (i<max){
            pasarArryUsuarioAFile(f,s.get(i));
            i++;
        }
    }
    public static void fileToArrayUsuarios(ArrayList<Usuario> s,String nombres){
        File f=new File(nombres);
        if(f.canRead()!=true){
            f.setReadable(true);
        }
        s.add(pasarArchivoAArrayUsuarios(f));//No estoy seguro de esto
    }
    public static void fileToArrayAviones(ArrayList<Avion> s,String nombres){
        File f=new File(nombres);
        if(f.canRead()!=true){
            f.setReadable(true);
        }
        //while (f.)
        s.add(pasarArchivoAArrayAviones(f));//No estoy seguro de esto
    }


    public static Usuario crearUsuario(){
        int dni=0;
        int edad=0;
        Usuario a;
        String Nombre="";
        String Apellido="";
        Scanner scan=new Scanner(System.in);
        Scanner sca=new Scanner(System.in);
        System.out.println("\nNombre: ");
        Nombre=sca.nextLine();
        System.out.println("\nApellido: ");
        Apellido=sca.nextLine();
        System.out.println("\nEdad: ");
        edad=scan.nextInt();
        System.out.println("\nDni: ");
        dni=scan.nextInt();
        a=new Usuario(Nombre,edad,dni,Apellido);
        return a;
    }

    public static void main(String[] args) {

        // Ni idea si los datos estan bien en los atributos, meti random, despues los checkeamos
        Empresa aeroTaxi = new Empresa();
        Gold avionGold = new Gold (1000, 100,50);
        Silver avionSilver = new Silver(1000, 250, 30);
        Bronze avionBronze = new Bronze(600, 100,  100);
        Menu menu = new Menu();

        aeroTaxi.aviones.add(avionGold);
        aeroTaxi.aviones.add(avionSilver);
        aeroTaxi.aviones.add(avionBronze);

        menu.menu(aeroTaxi);

    }
}
