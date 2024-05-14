package edu.jdc.runner;

import edu.jdc.controlador.Controlador;
import edu.jdc.modelo.Modelo;
import edu.jdc.vista.Vista;


public class Run {
    public static void main(String[] args) {
        Controlador controller = new Controlador();
        Vista view = new Vista();
        Modelo nuevoEvento = view.solicitarDatosEvento();
        nuevoEvento.setId(controller.obtenerIdUnico());
        controller.agregarEvento(nuevoEvento);


        System.out.println("Lista de eventos despues de agregar el nuevo evento:");
        controller.listarEventos();
    }
}
