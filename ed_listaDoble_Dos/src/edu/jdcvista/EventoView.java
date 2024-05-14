package edu.jdcvista;

import edu.jdc.controlador.SecuenciaEventos;
import edu.jdc.modelo.Evento;
import java.util.Scanner;

public class EventoView {
    private SecuenciaEventos secuenciaEventos;
    private Scanner scanner;

    public EventoView() {
    }

    public EventoView(SecuenciaEventos secuenciaEventos, Scanner scanner) {
        this.secuenciaEventos = secuenciaEventos;
        this.scanner = scanner;
    }
 
    public void mostrarMenu() {
        while (true) {
            System.out.println("    Menu     ");
            System.out.println("1. Agregar evento");
            System.out.println("2. Eliminar evento");
            System.out.println("3. Buscar eventos");
            System.out.println("4. Listar todos los eventos");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del número

            switch (opcion) {
                case 1:
                    agregarEvento();
                    break;

                case 2:
                    eliminarEvento();
                    break;

                case 3:
                    buscarEventos();
                    break;

                case 4:
                    listarEventos();
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ");
                    System.exit(0);

                default:
                    System.out.println("Opcion no válida. ");
            }
        }
    }

    private void agregarEvento() {
        System.out.println(" Agregar Evento ");
        System.out.print("Ingrese el ID del evento: ");
        int eventoId = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del número

        System.out.print("Ingrese el tipo de evento: ");
        String tipo = scanner.nextLine().trim();

        System.out.print("Ingrese el ID del usuario: ");
        int usuarioId = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del número

        System.out.print("Ingrese la fecha y hora del evento (formato: yyyy-MM-dd HH:mm:ss): ");
        String fechaHora = scanner.nextLine().trim();

        System.out.print("Ingrese el contenido del evento: ");
        String contenido = scanner.nextLine().trim();

        Evento nuevoEvento = new Evento(eventoId, tipo, usuarioId, fechaHora, contenido);
        secuenciaEventos.agregarEvento(nuevoEvento);

        System.out.println("Evento agregado con éxito.");
    }

    private void eliminarEvento() {
        System.out.println(" Eliminar Evento ");
        System.out.print("Ingrese el ID del evento a eliminar: ");
        int eventoIdAEliminar = scanner.nextInt();
        scanner.nextLine();
        
        if (secuenciaEventos.eliminarEvento(eventoIdAEliminar)) {
            System.out.println("Evento eliminado con éxito.");
        } else {
            System.out.println("No se encontró un evento con ese ID.");
        }
    }
    
    private void buscarEventos() {
        System.out.println(" Buscar Eventos ");
        System.out.print("Ingrese el tipo de evento (o dejar en blanco): ");
        String tipoBusqueda = scanner.nextLine().trim();

        System.out.print("Ingrese el ID de usuario (o 0 para ignorar): ");
        int usuarioIdBusqueda = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea después del número

        Evento[] resultados = secuenciaEventos.buscarEventos(tipoBusqueda, usuarioIdBusqueda);

        System.out.println("\nResultados de la búsqueda:");
        if (resultados != null) {
            for (Evento evento : resultados) {
                if (evento != null) {
                    evento.imprimirEvento();
                }
            }
        } else {
            System.out.println("No se encontraron eventos que coincidan con los criterios de búsqueda.");
        }
    }

    private void listarEventos() {
        System.out.println("\n=== Listar Todos los Eventos ===");
        Evento[] todosEventos = secuenciaEventos.obtenerTodosEventos();

        if (todosEventos != null) {
            for (Evento evento : todosEventos) {
                if (evento != null) {
                    evento.imprimirEvento();
                }
            }
        } else {
            System.out.println("No hay eventos para mostrar.");
        }
    }
    
    
}
