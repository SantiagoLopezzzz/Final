package edu.jdc.interfaces;

import javax.swing.DefaultListModel;

public interface Obligatorio {
    
    public void agregarElemento(int posicion, String valor);

    public void imprimir(DefaultListModel<String> salida);

    public void crearAleatorio(int tamanoMin, int tamanoMax,int cantiCaracteres);

    public void agregarElemento(String valor);

    public void eliminarElemento(DefaultListModel<String> salida);

    public void vaciarArreglo();
}
