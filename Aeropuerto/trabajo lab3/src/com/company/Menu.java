package com.company;

import java.util.Scanner;

public class Menu extends Main{

    public void menu (Empresa e)              //menu principal del programa -Tommy
    {
        int control=0;
        int i=0;
        Usuario u = new Usuario();
        Scanner scan = new Scanner(System.in);

        while (control != 3){
            System.out.println("\n1:Login");
            System.out.println("\n2:Nuevo usuario");
            System.out.println("\n3:Salir del sistema");
            control=scan.nextInt();

            switch (control){
                case 1:
                    login(e,u);
                    submenu(u,e);
                    break;

                case 2:
                    u= crearUsuario();
                    break;
                case 3:
                    System.out.println("Nos vemos en el Recu!");
                    break;
            }
        }
    }

    public void login (Empresa e, Usuario u){
        int dni =0;
        Scanner scan = new Scanner(System.in);

        while (u == null)
        {
            System.out.println("\nIngrese el Dni del usuario");
            dni = scan.nextInt();
            u = u.buscarUsuarios(e.usuarios, dni);
        }

        if (u != null){
            System.out.println("\nUsted a iniciado sesion como :" + u.getNombre() + u.getApellido());
        }

    }


    public void submenu (Usuario u, Empresa e){
        int i=0;
        Cuestionario c = new Cuestionario();
        Scanner scan = new Scanner(System.in);

        while (i != 4){

            System.out.println("\n1:Comprar vuelo\n");
            System.out.println("\n2:Cancelar vuelo\n");
            System.out.println("\n3:Mostrar Aviones disponibles");
            System.out.println("\n4:Cerrar sesion y volver");
            i=scan.nextInt();

            switch (i){
                case 1:
                    u.historialVuelos.add(c.contratarAvion(e));
                    break;

                case 2:
                    u.CancelarVuelo(e);

                    break;
                case 3:
                    System.out.println("");
                    e.listarAviones();
                    break;
                case 4:
                    System.out.println("\nAdios!");
                    break;
                default:
                    break;
            }
        }


        System.out.println(e.listarAviones());
    }



}
