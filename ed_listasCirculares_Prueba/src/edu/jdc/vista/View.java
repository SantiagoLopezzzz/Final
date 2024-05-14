package edu.jdc.vista;

import java.util.Scanner;


public class View {
    private Scanner scanner;

    // Constructor
    public View() {
        scanner = new Scanner(System.in);
    }

    // Método para solicitar al usuario el número de sillas
    public int promptNumChairs() {
        System.out.print("Ingrese el numero de sillas: ");
        return scanner.nextInt();
    }

    // Método para solicitar al usuario el número de jugadores
    public int promptNumPlayers() {
        System.out.print("Ingrese el numero de jugadores: ");
        return scanner.nextInt();
    }

    // Método para mostrar un mensaje
    public void displayMessage(String message) {
        System.out.println(message);
    }
}
