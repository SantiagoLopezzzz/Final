package edu.jdc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Nodo {
    private List<String> lista = new ArrayList<>();

    public List<String> getLista() {
        return lista;
    }

    public void agregarElemento(String elemento) {
        lista.add(elemento);
    }

    public void borrarElemento(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        } else {
            System.out.println("Error ");
        }
    }

    public void actualizarElemento(int indice, String nuevoValor) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, nuevoValor);
        } else {
            System.out.println("Error ");
        }
    }
    
}
