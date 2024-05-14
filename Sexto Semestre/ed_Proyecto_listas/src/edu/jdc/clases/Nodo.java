package edu.jdc.clases;


public class Nodo {
    private Nodo miNodo;
    private int dato;
    private Nodo cabeza;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Nodo miNodo, int dato, Nodo cabeza, Nodo siguiente) {
        this.miNodo = miNodo;
        this.dato = dato;
        this.cabeza = cabeza;
        this.siguiente = null;
    }

    public Nodo getMiNodo() {
        return miNodo;
    }

    public void setMiNodo(Nodo miNodo) {
        this.miNodo = miNodo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
