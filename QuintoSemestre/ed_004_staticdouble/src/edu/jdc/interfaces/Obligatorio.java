package edu.jdc.interfaces;

import javax.swing.DefaultListModel;

public interface Obligatorio {
    
    public void agregarElemento(int posicion, double valor);

    public void imprimir(DefaultListModel<String> salida);

    public void crearAleatorio(int tamanoMin, int tamanoMax, double desde, double hasta);

    public void agregarElemento(double valor);

    public void eliminarElemento(DefaultListModel<String> salida);

    public void vaciarArreglo();
}
