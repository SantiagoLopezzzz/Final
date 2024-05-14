package edu.jdc.runner;

import edu.jdc.controlador.Controlador;
import edu.jdc.modelo.Pila;
import edu.jdc.vista.Vista;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila model = new Pila();
        Vista view = new Vista();
        Controlador controller = new Controlador(model, view);

        
        System.out.print("Ingresa la linea de caracteres: ");
        String input = scanner.nextLine();

        controller.checkBalance(input);
        
        scanner.close();
    }
}
