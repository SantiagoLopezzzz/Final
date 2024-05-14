package edu.jdc.modelo;


public class NodoLista {
    public String dato;
    public NodoLista siguiente;


    public NodoLista(String dato) {
        this.dato = dato;
        this.siguiente = null;

    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }


    
    
}
