package edu.jdc.vista;

import java.util.List;


public class Vista {
    public void mostrarLista(List<String> lista) {
        System.out.println("Lista creada es esta: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }
        System.out.println();
    }
}
