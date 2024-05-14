package edu.jdc.run;

import edu.jdc.controlador.ControladorContrasena;
import edu.jdc.modelo.Pila;
import edu.jdc.vista.VistaContrasena;


public class Main {
    public static void main(String[] args) {
        Pila modelo = new Pila();
        VistaContrasena vista = new VistaContrasena(new ControladorContrasena(modelo, null));
        ControladorContrasena controlador = new ControladorContrasena(modelo, vista);
        controlador.Iniciar();
        
    }
}
