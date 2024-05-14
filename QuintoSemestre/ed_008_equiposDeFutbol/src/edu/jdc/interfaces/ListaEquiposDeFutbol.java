package edu.jdc.interfaces;

import javax.swing.DefaultListModel;

public interface ListaEquiposDeFutbol {

    public void agregarElemento(int posicion, int valor);

    public void imprimir(DefaultListModel<String> salida);

    public void crearAleatorio(int tamanoMin, int tamanoMax, int desde, int hasta);

    public void agregarElemento(int valor);

    public void eliminarElemento(DefaultListModel<String> salida);

    public void vaciarArreglo();

}
