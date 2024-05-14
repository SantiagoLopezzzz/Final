package edu.jdc.vista;

import edu.jdc.modelo.Modelo;
import java.util.Scanner;

public class Vista {
    private Scanner scanner = new Scanner(System.in);
    
    public Modelo solicitarDatosEvento() {
        System.out.print("Ingrese el tipo de evento (publicacion, comentario, reaccion): ");
        String tipo = scanner.nextLine();

        System.out.print("Ingrese el ID del usuario que realiza el evento: ");
        int idUsuario = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la fecha y hora del evento (ej. 2024-03-12 10:30): ");
        String fechaHora = scanner.nextLine();

        System.out.print("Ingrese el contenido del evento: ");
        String contenido = scanner.nextLine();

        return new Modelo(0, tipo, idUsuario, fechaHora, contenido);
    }
}
