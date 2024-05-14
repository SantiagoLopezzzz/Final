package edu.jdc.listas;

public class MINodo {

    public MINodo() {
        dato = null;
        siguiente = null;
    }
    private Object dato;
    private MINodo siguiente;

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public MINodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(MINodo siguiente) {
        this.siguiente = siguiente;
    }

}






