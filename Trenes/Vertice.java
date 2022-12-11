//Vertice
import java.util.*;
public class Vertice
{  
    private int CapacidadTren;
    private int NumeroTrenes;
    private String NomEstacion;
    public Vertice(String nombreEstacion,int capacidadTren,int NroTrenes)
    {
       NomEstacion=nombreEstacion;
       CapacidadTren=capacidadTren;
       NumeroTrenes=NroTrenes;
    }
    public String getNombre(){
        return NomEstacion;
    }
    public int getCapacidad(){
        return CapacidadTren;
    }
    public int getNroTrenes(){
        return NumeroTrenes;
    }
}
