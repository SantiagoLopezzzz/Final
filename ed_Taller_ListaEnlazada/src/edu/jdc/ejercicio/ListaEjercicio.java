package edu.jdc.ejercicio;

import java.util.Scanner;


public class ListaEjercicio {
    
    
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los elementos de la lista (Ingrese 1 para terminar):");
        int valor = leer.nextInt();
        while (valor != 1) {
            lista.agregar(valor);
            valor = leer.nextInt();
        }

        System.out.println("Lista original:");
        lista.imprimir();

        lista.removerDuplicados();

        System.out.println("Lista después de eliminar duplicados:");
        lista.imprimir();

        leer.close();
    }
    
}
