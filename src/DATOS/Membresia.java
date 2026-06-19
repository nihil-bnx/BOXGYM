package DATOS;

public class Membresia {
    double costo;
    int duracionDias;

    public Membresia() {
    }

    public Membresia(double costo, int duracionDias) {
        this.costo = costo;
        this.duracionDias = duracionDias;
    }
    
    
     //TIPOS DE MEMBRESIAS
    public void membresiaMensual(){
    costo = 150;
    duracionDias = 30;
    }
    
    public void membresiaTrimestral(){
    costo = 400;
    duracionDias = 90;
    }
    
    public void membresiaAnual(){
    costo = 1500;
    duracionDias = 365;
    }
    
    public void visitante(){
    costo = 15;
    duracionDias = 1;
    }

    
    
    
    
    
    
    
}
