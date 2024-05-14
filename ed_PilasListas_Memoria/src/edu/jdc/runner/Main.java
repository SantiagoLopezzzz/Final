package edu.jdc.runner;

import edu.jdc.controlador.MemoriaControlador;
import edu.jdc.modelo.MemoriaModelo;
import edu.jdc.vista.MemoriaVista;


public class Main {
    public static void main(String[] args) {
        MemoriaModelo modelo = new MemoriaModelo();
        MemoriaVista vista = new MemoriaVista();
        MemoriaControlador controlador = new MemoriaControlador(modelo, vista);
    }
}
