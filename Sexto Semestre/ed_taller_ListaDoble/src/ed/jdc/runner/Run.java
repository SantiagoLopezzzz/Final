package ed.jdc.runner;

import ed.jdc.controlador.ListaDoble;
import ed.jdc.modelo.Nodo;
import ed.jdc.vista.Vista;
import java.util.List;
import java.util.Scanner;


public class Run {
    public static void main(String[] args) {
        ListaDoble controller = new ListaDoble();
        Vista vista = new Vista();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar estudiante al final");
            System.out.println("2. Agregar estudiante al principio");
            System.out.println("3. Eliminar estudiante del final");
            System.out.println("4. Eliminar estudiante del principio");
            System.out.println("5. Mostrar listado de estudiantes");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del estudiante:");
                    String nombreE = scanner.next();
                    System.out.println("Ingrese edad del estudiante:");
                    int edadE = scanner.nextInt();
                    controller.agregarEstudianteAlFinal(edadE, nombreE);
                    break;
                case 2:
                    System.out.println("Ingrese nombre del estudiante:");
                    String nombre2 = scanner.next();
                    System.out.println("Ingrese edad del estudiante:");
                    int edad2 = scanner.nextInt();
                    controller.agregarEstudianteAlFinal(edad2, nombre2);
                    break;
                case 3:
                    controller.eliminarEstudianteDelFinal();
                    break;
                case 4:
                    controller.eliminarEstudianteDelPrincipio();

                case 5:
                    controller.obtenerListaEstudiantes();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
