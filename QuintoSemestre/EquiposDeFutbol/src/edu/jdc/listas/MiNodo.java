
package edu.jdc.listas;


public class MiNodo {

    public MiNodo() {
        dato = null; 
        siguiente = null;
    }
    
    private Object dato;
    private MiNodo siguiente;

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public MiNodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(MiNodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
