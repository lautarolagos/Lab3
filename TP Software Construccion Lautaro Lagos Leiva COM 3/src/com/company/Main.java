package com.company;

public class Main {

    public static void main(String[] args) {
        Arquitecto arquitecto1 = new Arquitecto("Juan", 5476223, 445655, 2000, 7555);
        Maestro maestro1 = new Maestro("Carlitos", 77777, 23145, 1800, 34);
        Obrero obrero1 = new Obrero("Sebastian", 3542, 85245, 1500, 19);

        Arquitecto arquitecto2 = new Arquitecto("Damian", 11111, 42211, 2000, 9543);
        Maestro maestro2 = new Maestro("Juan Carlos", 457776, 666666, 1800, 37);
        Obrero obrero2 = new Obrero("Rodrigo", 5057, 999999, 1500, 24);

        Arquitecto arquitecto3 = new Arquitecto("Nicolas", 123456, 987654, 2000, 1111);
        Maestro maestro3 = new Maestro("Lautaro", 77777, 54753, 1800, 30);
        Obrero obrero3 = new Obrero("Matias", 33333, 6555, 1500, 23);


        System.out.println(arquitecto1.crearPlanos());
        System.out.println(maestro1.construir());
        System.out.println(obrero1.construir());

        // Obra Comercial
        Empresa empresita = new Empresa("Empresita");
        Comercial local = new Comercial("Empresita", "Independencia 2000", 200, 30, 200, "Loovas");
        empresita.obras.add(local);
        empresita.empleados.add(arquitecto1);
        empresita.empleados.add(maestro1);
        empresita.empleados.add(obrero1);
        local.empleados.add(arquitecto1);
        local.empleados.add(maestro1);
        local.empleados.add(obrero1);

        System.out.println(empresita.verEmpleados());
        System.out.println(empresita.verObras());
        System.out.println("Costo aprox de la obra: $" +local.calcularCosto());

        // Obra Hotel
        Hotel hotelito = new Hotel("Empresita", "Juan b Justo 2456", 300, 40, 150, "Hotel Lujo", 10);
        empresita.obras.add(hotelito);
        empresita.empleados.add(arquitecto2);
        empresita.empleados.add(maestro2);
        empresita.empleados.add(obrero2);

        // Obra Domestica
        Empresa empresa1 = new Empresa("Best Casas");
        Domestica casita = new Domestica("Best Casas", "Belgrano 1566", 100, 25,125, 4);
        empresa1.obras.add(casita);
        empresa1.empleados.add(arquitecto3);
        empresa1.empleados.add(maestro3);
        empresa1.empleados.add(obrero3);
        System.out.println(empresa1.verObras());

    }
}
