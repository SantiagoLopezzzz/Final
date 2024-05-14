package edu.jdc.modelos;

/* Fecha: 17 octubre 2023
   Autor: Camilo Hernández 
    Grafos versión uno
 */
public class Nodo {

//Variables globales
    private String value;

// Metodo constructor
    public Nodo() {
        value = "";

    }

    public Nodo(String value) {
        //Metodo que crea los nodos
        // Tipo de dato String-porque no se utiliza un tipo de datos especifico 
        this.value = value;
    }

// Metodos Propios
    //Metodo que sirve para duplicidad de los nodos, o si los nodos son iguales
    public boolean nodoiguales(Nodo vertice) {

        return value.equals(vertice.value);

    }

// Metodos get y set
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
