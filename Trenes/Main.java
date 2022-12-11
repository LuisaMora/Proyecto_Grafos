import java.util.*;
public class Main
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-----------------------Datos Linea Amarilla---------------------");
        System.out.println(" ");
        //Estradas para la Linea Amarilla
        System.out.print("Ingrese el numero de estaciones Linea Amarilla:");
        int nroEAmarilla=in.nextInt();
        System.out.print("Ingrese la cantidad de trenes que tienen las estaciones de la Linea Amarilla:");
        int nroTAmarilla=in.nextInt();
        System.out.print("Capacidad de los trenes");
        int CapTA=in.nextInt();
        System.out.print("Cantidad de pasajeros por tren:");
        int nroPAmarilla=in.nextInt();
        System.out.print("Demanda de pasajeros Linea Amarilla:");
        int nroDemandaA=in.nextInt();
        System.out.print("Ingrese la velocidad maxima Linea Amarilla:");
        int VmaxA=in.nextInt();
        System.out.print("Ingrese la velocidad minima Linea Amarilla:");
        int VminA=in.nextInt();
        
        System.out.println(" ");
        System.out.println("-----------------------Datos Linea Roja---------------------");
        System.out.println(" ");
        //Entradas para la Linea Roja
        System.out.print("Ingrese el numero de estaciones Linea Roja:");
        int nroERoja=in.nextInt();
        System.out.print("Ingrese la cantidad de trenes que tienen las estaciones de la Linea Roja:");
        int nroTRoja=in.nextInt();
        System.out.print("Capacidad de los trenes");
        int CapTR=in.nextInt();
        System.out.print("Demanda de pasajeros Linea Roja:");
        int nroPRoja=in.nextInt();
        System.out.print("Ingrese la velocidad maxima Linea Roja:");
        int VmaxR=in.nextInt();
        System.out.print("Ingrese la velocidad minima Linea Roja:");
        int VminR=in.nextInt();
        
        System.out.println(" ");
        System.out.println("-----------------------Datos Linea Verde---------------------");
        System.out.println(" ");
        //Entradas para la Linea Verde
        System.out.print("Ingrese el numero de estaciones Linea Verde:");
        int nroEVerde=in.nextInt();
        System.out.print("Ingrese la cantidad de trenes que tienen las estaciones de la Linea Verde:");
        int nroTVerde=in.nextInt();
        System.out.print("Capacidad de los trenes");
        int CapTV=in.nextInt();
        System.out.print("Demanda de pasajeros Linea Verde:");
        int nroPVerde=in.nextInt();
        System.out.print("Ingrese la velocidad maxima Linea Verde:");
        int VmaxV=in.nextInt();
        System.out.print("Ingrese la velocidad minima Linea Verde:");
        int VminV=in.nextInt();
       
        //Creacion de todo desde la estacion central 
        Estacion_Central estacion = new Estacion_Central(nroEAmarilla,nroTAmarilla,CapTA,nroPAmarilla,nroDemandaA,VmaxA,VminA,nroERoja,nroTRoja,CapTR,nroPRoja,VmaxR,VminR,nroEVerde,nroTVerde,CapTV,nroPVerde,VmaxV,VminV);
        estacion.PlanificacionesLineas();
        //estacion.Planificacion_Buses();
    }

}
