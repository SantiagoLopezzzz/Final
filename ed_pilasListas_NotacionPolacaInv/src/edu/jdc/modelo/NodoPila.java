package edu.jdc.modelo;


public class NodoPila {
    public NodoLista top;

    public NodoPila(NodoLista top) {
        this.top = null;
    }
    

    public void push (String dato){
        NodoLista nuevoNodo = new NodoLista(dato);
        if (top == null) {
            top = nuevoNodo;
        } else {
            nuevoNodo.siguiente = top;
            top = nuevoNodo;
        }
    }
    public String pop() {
        if (top == null) {
            System.out.println("La pila está vacía");
            return "";
        } else {
            String dato = top.dato;
            top = top.siguiente;
            return dato;
        }
    }

    public boolean isEmpty() {
        
        return top == null;
    }
}
