package edu.jdc.modelo;


public class NodoPila {
    public String dato;
    public NodoPila siguiente;

    public NodoPila(String dato) {
        this.dato = dato;
        this.siguiente = null;

    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
