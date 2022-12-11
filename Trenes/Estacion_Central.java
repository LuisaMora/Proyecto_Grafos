import java.util.*;
public class Estacion_Central
{
    public int CapacidadEstacionCentral;
    public int TiempoEntreEstaciones;
    public HashMap<String,Grafo> Lineas;
    public ArrayList<Vertice> v;
    public ArrayList<Arista> a;
    public ArrayList<Vertice> vx;
    public ArrayList<Arista> ax;
    int contador;
    public Estacion_Central(int nroEAmarilla,int nroTAmarilla,int CapTA,int nroPAmarilla,int nroDemandaA,int VmaxA,int VminA,int nroERoja,int nroTRoja,int CapTR,int nroPRoja,int VmaxR,int VminR,int nroEVerde,int nroTVerde,int CapTV,int nroPVerde,int VmaxV,int VminV)
    {
      contador=1;
      Lineas=new HashMap<String,Grafo>();
      vx=new ArrayList<Vertice>();
       ax=new ArrayList<Arista>();
      //Definiendo los valores de la linea Amarilla
      int NumEstacionesA=nroEAmarilla;
      int NumTrenesA=nroTAmarilla;
      int CapacidadTrenesA=CapTA;
      int CantidadPasajerosA=nroPAmarilla;
      int DemandaPasajerosA=nroDemandaA;
      int VelocidadMaxA=VmaxA;
      int VelocidadMinA=VminA; 
      //Definiendo los valores de la linea Roja
      int NumEstacionesR=nroERoja;
      int NumTrenesR=nroTRoja;
      int CapacidadTrenesR=CapTR;
      int CantidadPasajerosR=nroPRoja;
      int VelocidadMaxR=VmaxR;
      int VelocidadMinR=VminR; 
      //Definiendo los valores de la linea Verde
      int NumEstacionesV=nroEVerde;
      int NumTrenesV=nroTVerde;
      int CapacidadTrenesV=CapTV;
      int CantidadPasajerosV=nroPVerde;
      int VelocidadMaxV=VmaxV;
      int VelocidadMinV=VminV; 
      CrearLineasEstaciones(NumEstacionesA,NumTrenesA,CapacidadTrenesA,VelocidadMaxA,VelocidadMinA);
      CrearLineasEstaciones(NumEstacionesR,NumTrenesR,CapacidadTrenesR,VelocidadMaxR,VelocidadMinR);
      CrearLineasEstaciones(NumEstacionesV,NumTrenesV,CapacidadTrenesV,VelocidadMaxV,VelocidadMinV);
    }
    public void CrearLineasEstaciones(int numE,int numT,int CapT,int vmax,int vmin){
      v=new ArrayList<Vertice>();
      a=new ArrayList<Arista>();
      Grafo Linea= new Grafo(v,a);
      //HashMap<ArrayList<Vertice>,ArrayList<Arista>> estaciones= new HashMap<ArrayList<Vertice>,ArrayList<Arista>>();
      Linea.CrearEstaciones(numE,numT,CapT,vmax,vmin);
      //estaciones.put(Linea.getvertices(),Linea.getaristas());
      if(contador==1){
          Lineas.put("Linea Amarilla",Linea);
          contador++;
        }else if(contador==2){
            Lineas.put("Linea Roja",Linea);
            contador++;
        }else if(contador==3){
             Lineas.put("Linea Verde",Linea);
             contador++;
        }
    }
    public void PlanificacionesLineas(){
        Grafo variable=new Grafo(v,a);
        System.out.println(" ");
        System.out.println("LINEA AMARILLA PLANIFICACION DE SALIDAS");
        variable=Lineas.get("Linea Amarilla");
        a=variable.getaristas();
        CalcularRutas(variable,a);
        
        System.out.println(" ");
        System.out.println("LINEA ROJA PLANIFICACION DE SALIDAS");
        variable=Lineas.get("Linea Roja");
        a=variable.getaristas();
        CalcularRutas(variable,a);
        
        System.out.println(" ");
        System.out.println("LINEA VERDE PLANIFICACION DE SALIDAS");
        variable=Lineas.get("Linea Verde");
        a=variable.getaristas();
        CalcularRutas(variable,a);
        
        
    }
    public void CalcularRutas(Grafo variable,ArrayList<Arista> aristas){
        for(int i=0;i<a.size();i++){ 
            Arista arista=a.get(i);
            Vertice vertice1=arista.getvertice1();
            Vertice vertice2=arista.getvertice2();
            System.out.println(" "); 
            System.out.println("Horario :"+((i+a.size())+2)+":00");
            System.out.println("Salida : "+vertice1.getNombre());
            System.out.println("Llegada : "+vertice2.getNombre());
            //System.out.println(a.get(i).getPeso());
        }
    }
}
