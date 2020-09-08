package com.company;
//import java.io.Serializable;
import java.awt.*;
import java.util.Scanner;

public class Cuestionario {
    private String fecha;
    private String origen;
    private String destino;
    private int cantAcomp;
    private int idAvion;
    private int idContrato; // ID del contrato, o sea de la compra del vuelo
    private float costoVuelo;
    private int vueloCancelado;
    Avion avion;
    Usuario usuario;


    public Cuestionario() {
    }

    public Cuestionario(String fecha, String origen, String destino, int cantAcomp, int idAvion, int idContrato, float costoVuelo) {
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.cantAcomp = cantAcomp;
        this.idAvion = idAvion;
        this.idContrato = idContrato;
        this.costoVuelo = costoVuelo;
        this.vueloCancelado = 0;
    }

    public int calculoDestino (){             //dependiendo de los strings va a ser un valor u otro, es llamada por calculo costo -Tommy
        int rta= 0;
        int i;
        int j;
        String bs = new String("BsAs");
        String cor= new String("Cordiba");
        String san = new String("Santiago");
        String monte = new String("Montevideo");

        if ( (i=origen.compareTo(bs)) == 0 && (j=destino.compareTo(cor)) == 0 ){
            rta = 695;
        }else if ( (i=origen.compareTo(bs)) == 0 && (j=destino.compareTo(san)) == 0 ){
            rta = 1400;
        }else if ( (i=origen.compareTo(bs)) == 0 && (j=destino.compareTo(monte)) == 0 ){
            rta = 950;
        }else if ( (i=origen.compareTo(cor)) == 0 && (j=destino.compareTo(monte)) == 0 ){
            rta = 1190;
        }else if ( (i=origen.compareTo(cor)) == 0 && (j=destino.compareTo(san)) == 0 ){
            rta = 1050;
        }else if ( (i=origen.compareTo(monte)) == 0 && (j=destino.compareTo(san)) == 0 ){
            rta = 2100;
        }

        return rta;
    }

    public int calculoCosto (Avion a, int acomp){                       // calcula el costo final del vuelo -Tommy
        int destino=calculoDestino();


        int i= ((destino* a.getCostoPorKM()) + (acomp * 3500) + a.getTarifaTipoAvion());


        return i;
    }

    public Cuestionario contratarAvion(Empresa e) // Este es el metodo para contratar un avion, un vuelo, btw mañana pregunto si se pueden meter Prints en los metodos
    {
        Avion a = new Avion();
        Cuestionario c = new Cuestionario();
        Scanner scan = new Scanner(System.in);
        int control =0;
        int id=0;

        System.out.println("Ingrese la fecha deseada para el vuelo: ");
        c.setFecha(scan.nextLine()); // Esto no se si esta bien, tipo el "fecha" quizas tiene que ser "setFecha" o algo así, Lo mismo para las demas cosas
        System.out.println("Ingrese el origen: ");
        c.setOrigen(scan.nextLine());
        System.out.println("Ingrese el destino: ");
        c.setDestino(scan.nextLine());

        while (c.getOrigen().equals(c.getDestino()) == true){        // si destino y origen son iguales te pide que ingrese otro -Tommy
            System.out.println("\nIngrese otro destino por favor :");
            c.setDestino(scan.nextLine());
        }

        while (control != 1){
            System.out.println("\na continuacion se le mostrar los aviones disponibles");                           //Falta implementar el buscar por fecha y comprobar
            e.listarAviones();
            System.out.println("\nIngrese la id del avion que desea usar: ");
            id = scan.nextInt();
            a=a.getAvionPorid(id,e.aviones);

            System.out.println("\nIngrese cantidad de acompañantes: ");
            c.setCantAcomp(scan.nextInt());
            if (a.getCapacidadMaxDePasajeros() <= c.getCantAcomp()){
                control=1;
                c.setIdAvion(a.getIdAvion());
            }else {
                System.out.println("\nLa cantidad de pasajeros es mayor a la capacidad del avio, elija otro :");
            }

        }


        c.setCostoVuelo(calculoCosto(avion, c.getCantAcomp()));

        return c;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCantAcomp() {
        return cantAcomp;
    }

    public void setCantAcomp(int cantAcomp) {
        this.cantAcomp = cantAcomp;
    }

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public float getCostoVuelo() {
        return costoVuelo;
    }

    public void setCostoVuelo(float costoVuelo) {
        this.costoVuelo = costoVuelo;
    }

    public int getVueloCancelado() {
        return vueloCancelado;
    }

    public void setVueloCancelado(int vueloCancelado) {
        this.vueloCancelado = vueloCancelado;
    }

    @Override
    public String toString()
    {
        return "Origen: " +origen+ " | Destino: " +destino+ " | Cantidad de acompañantes: " +cantAcomp+ " | ID Avion: " +idAvion+ " | ID Contrato: " +idContrato +"\n";
    }


}
