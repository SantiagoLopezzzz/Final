package edu.jdc.modelo;


public class Nodo {
    private String dato;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    public String getDato (){
        
        return dato;
        
    }
    public void setDato (String dato){
        this.dato = dato;
    }
    
    public Nodo getSiguiente (){
        
        return siguiente;
        
    }
    public void setSiguiente (Nodo siguiente){
        this.siguiente = siguiente;
    }
    
}
