package edu.jdc.controlador;


import edu.jdc.vista.Vista;
import edu.jdc.modelo.Nodo;

class Controlador {
    private Nodo modelo;
    private Vista vista;

    public Controlador() {
    }
    

    public Controlador(Nodo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void añadirElemento(String elemento) {
        modelo.agregarElemento(elemento);
        vista.mostrarLista(modelo.getLista());
    }

    public void borrarElemento(int indice) {
        modelo.borrarElemento(indice);
        vista.mostrarLista(modelo.getLista());
    }

    public void actualizarElemento(int indice, String nuevoValor) {
        modelo.actualizarElemento(indice, nuevoValor);
        vista.mostrarLista(modelo.getLista());
    }
}