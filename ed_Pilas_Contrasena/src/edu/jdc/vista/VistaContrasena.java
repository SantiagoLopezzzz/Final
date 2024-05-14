package edu.jdc.vista;

import edu.jdc.controlador.ControladorContrasena;
import java.util.Scanner;


public class VistaContrasena {
    private Scanner scanner;
    private ControladorContrasena controlador;

    public VistaContrasena(ControladorContrasena con) {
        scanner = new Scanner(System.in);
    }
    
    public void obtenerContrasena() {
        System.out.print("Ingrese la contrasena: ");
        String contrasena = scanner.nextLine();
        controlador.manipularContrasena(contrasena);
    }
    

}
