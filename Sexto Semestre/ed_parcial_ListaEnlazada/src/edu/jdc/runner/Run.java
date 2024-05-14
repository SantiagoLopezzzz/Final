package edu.jdc.runner;



import edu.jdc.vista.Vista;
import edu.jdc.modelo.Nodo;
import edu.jdc.Controlador;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Nodo modelo = new Nodo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido a la lista ");
            System.out.println("Seleccione un numero dependiendo de la accion ");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Actualizar elemento");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a añadir: ");
                    String nuevoElemento = scanner.nextLine();
                    controlador.añadirElemento(nuevoElemento);
                    break;
                case 2:
                    System.out.print("Ingrese el índice del elemento a borrar: ");
                    int indiceBorrar = scanner.nextInt();
                    controlador.borrarElemento(indiceBorrar);
                    break;
                case 3:
                    System.out.print("Ingrese el índice del elemento a actualizar: ");
                    int indiceActualizar = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingrese el nuevo valor: ");
                    String nuevoValor = scanner.nextLine();
                    controlador.actualizarElemento(indiceActualizar, nuevoValor);
                    break;
                case 4:
                    vista.mostrarLista(modelo.getLista());
                    break;
                case 5:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

}
