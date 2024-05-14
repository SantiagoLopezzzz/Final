package edu.jdc.ejercicio;

public class ListaEnlazada {

    private ListaNodo cabeza;

    public ListaEnlazada() {
    }

    public void agregar(int dato) {
        ListaNodo nuevoNodoo = new ListaNodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodoo;
        } else {
            ListaNodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodoo;
        }

    }

    public void removerDuplicados() {
        ListaNodo actual = cabeza;

        while (actual != null) {
            ListaNodo siguiente = actual.siguiente;
            while (siguiente != null && siguiente.dato == actual.dato) {
                siguiente = siguiente.siguiente;
            }
            actual.siguiente = siguiente;
            actual = actual.siguiente;
        }
    }

    public void imprimir() {
        ListaNodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

}
