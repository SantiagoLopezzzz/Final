package edu.jdc.modelo;


public class Lista {
    
    private NodoLista inicio;

    public Lista() {
    }

    public Lista(NodoLista inicio) {
        this.inicio = null;
    }
    
    public void insertarAlfinal (String dato){
        NodoLista nuevoNodo = new NodoLista(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
        } else {
            NodoLista temporal = inicio;
            while (temporal.siguiente != null) {
                temporal = temporal.siguiente;
                
            }
            temporal.siguiente = nuevoNodo;
        }
    }
    
    public void imprimirLista (){
        NodoLista temporal = inicio;
        while (temporal != null) {
            System.out.println(temporal.dato+ " ");
            temporal = temporal.siguiente;
        }
        System.out.println();
    }
    
    public String convertirAString() {
        StringBuilder resultado = new StringBuilder();
        NodoLista temp = inicio;
        while (temp != null) {
            resultado.append(temp.dato).append(" ");
            temp = temp.siguiente;
        }
        return resultado.toString();
    }
    
    
}
