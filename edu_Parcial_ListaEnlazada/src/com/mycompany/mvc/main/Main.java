package com.mycompany.mvc.main;
/*
Autor: Santiago Lopez Fonseca 
Descripcio:Parcial 


Autor: Santiago Lopez Fonseca 
Descripcio:Parcial 

 */
import com.mycompany.mvc.controlador.TrenControlador;
import com.mycompany.mvc.modelo.TrenModelo;
import com.mycompany.mvc.vista.TrenVista;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TrenModelo modelo = new TrenModelo();
        TrenVista vista = new TrenVista();
        TrenControlador controlador = new TrenControlador(modelo, vista);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al tren ");
            System.out.println("Ingrese su opcion: ");
            System.out.println("1. Agregar vagon ");
            System.out.println("2. Desenganchar vagon ");
            System.out.println("3. Mostrar tren ");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlador.agregarVagon();
                    break;
                case 2:
                    controlador.desengancharVagon();
                    break;
                case 3:
                    controlador.imprimirTren();
                    break;
                case 4:
                    System.out.println("Gracias ");
                    System.exit(0);
                default:
                    System.out.println("Error ");
            }
        }
    }
}
