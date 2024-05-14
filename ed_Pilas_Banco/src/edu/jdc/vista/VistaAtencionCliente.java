package edu.jdc.vista;

import edu.jdc.controlador.ControladorAtencionCliente;
import edu.jdc.modelo.ModeloAtencionCliente;
import java.util.Scanner;

public class VistaAtencionCliente {

    private ControladorAtencionCliente controlador;
 

    public VistaAtencionCliente() {
        this.controlador = new ControladorAtencionCliente(new ModeloAtencionCliente(), this);

    }

public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            controlador.ejecutarOpcion(opcion);
        }
    }


    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarMenu() {
        mostrarMensaje("Bienvenido al  banco");
        mostrarMensaje("1. Agregar cliente ");
        mostrarMensaje("2. Atender cliente ");
        mostrarMensaje("3. Salir ");
        mostrarMensaje("");
        mostrarMensaje("Ingrese su opción: ");

    }


    public void solicitarNombreCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        modelo.agregarCliente(nombre);
        
    }

}
