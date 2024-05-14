package com.mycompany.mvc.vista;

/*
Autor: Santiago Lopez Fonseca 
Descripcio:Parcial 

 */
import java.util.ArrayList;
import java.util.Scanner;

public class TrenVista {

    private Scanner scanner;

    public TrenVista() {
        scanner = new Scanner(System.in);
    }

    public int solicitarDato() {
        System.out.print("Ingrese el dato: ");
        return scanner.nextInt();
    }

    public void imprimirTren(ArrayList<Integer> vagones) {
        System.out.print("Tren: ");
        for (int vagon : vagones) {
            System.out.print(vagon + " ");
        }
        System.out.println();
    }
}
