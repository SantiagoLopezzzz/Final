package edu.jdc.modelo;

public class Variable {
    private String nombre;
    private int tamaño;
    private Variable siguiente;
    private Variable anterior;

    public Variable(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public Variable getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Variable siguiente) {
        this.siguiente = siguiente;
    }

    public Variable getAnterior() {
        return anterior;
    }

    public void setAnterior(Variable anterior) {
        this.anterior = anterior;
    }
}