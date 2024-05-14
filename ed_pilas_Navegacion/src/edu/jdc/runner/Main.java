package edu.jdc.runner;

import edu.jdc.controlador.HistorialNavegacion;
import edu.jdc.vista.VistaHistorial;


public class Main {

    public static void main(String[] args) {
        HistorialNavegacion historial = new HistorialNavegacion();
        VistaHistorial vista = new VistaHistorial(historial);
    }
}
