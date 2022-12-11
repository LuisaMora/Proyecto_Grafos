import java.util.*;
public class Grafo
{
    private ArrayList<Vertice> ver; 
    private ArrayList<Arista> ari; 
    final Vertice central=new Vertice("Estacion Central",0,0);
    public Grafo(ArrayList<Vertice> ve ,ArrayList<Arista> ar)
    {
        ver=ve;                               
        ari=ar;
    }
     public void CrearEstaciones(int nroestaciones,int nrodetrenes,int capacidadtren,int max,int min){
        for(int i=0;i<nroestaciones;i++){
             i++;
             Vertice v= new Vertice("Estacion "+i,nrodetrenes,capacidadtren);
             ver.add(v);
             i--; 
            }
         if(ver.size()==1){
             Vertice uno=ver.get(0);
             Arista a= new Arista(central,uno,max,min);
             ari.add(a);
            }else{
         for(int c=0;c<ver.size()-1;c++){
           if(c==0){
               Vertice uno=ver.get(c);
               Arista a= new Arista(central,uno,max,min);
               ari.add(a);
            }
           //System.out.println("entrando");
           Vertice uno=ver.get(c);
           Vertice dos=ver.get(c+1);
           Arista a= new Arista(uno,dos,max,min);
           ari.add(a);
         }
        }
    }
    public void setvertices(ArrayList<Vertice> vertices){
        ver=vertices;
    }
    public void setaristas(ArrayList<Arista> aristas){
        ari=aristas;
    }
    public ArrayList<Vertice> getvertices(){
        return ver;
    }
    public ArrayList<Arista> getaristas(){
        return ari;
    }
}
