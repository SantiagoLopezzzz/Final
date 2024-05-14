package edu.jdc.runner;

import edu.jdc.controlador.Controlador;
import edu.jdc.vista.VistaHistorial;


public class Main {
    public static void main(String[] args) {
        Controlador historial = new Controlador();
        VistaHistorial vista = new VistaHistorial(historial);
    }
}
