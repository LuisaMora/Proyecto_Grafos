//Arista
import java.util.*;
public class Arista
{
    private ArrayList<Vertice> vecinos;
    private Vertice v1,v2;
    private int Peso;
     public Arista(Vertice vertice1,Vertice vertice2,int max,int min)
    {
        v1=vertice1;
        v2=vertice2;
        Peso=(max+min)/2;
    }
    public int getPeso(){
        return Peso;
    }
    public Vertice getvertice1(){
        return v1;
    }
    public Vertice getvertice2(){
        return v2;
    }
}
