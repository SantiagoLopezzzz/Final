package edu.jdc.modelo;


public class Pila {
    private NodoPila  top;

    public Pila() {
        this.top = null;
    }

    public void push(String dato) {
        NodoPila nuevoNodo = new NodoPila(dato);
        if (top == null) {
            top = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(top);
            top = nuevoNodo;
        }
    }

    public NodoPila pop() {
        if (top == null) {
            return null;
        } else {
            NodoPila nodoEliminado = top;
            nodoEliminado.siguiente = null;
            return nodoEliminado;
        }

    }

}
