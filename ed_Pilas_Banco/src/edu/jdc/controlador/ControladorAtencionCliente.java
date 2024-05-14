package edu.jdc.controlador;

import edu.jdc.modelo.ModeloAtencionCliente;
import edu.jdc.vista.VistaAtencionCliente;

public class ControladorAtencionCliente {
    public ModeloAtencionCliente modelo;
    public VistaAtencionCliente vista;

    public ControladorAtencionCliente(ModeloAtencionCliente modelo, VistaAtencionCliente vista) {
        this.modelo = modelo;
        this.vista = vista;
    }



    public void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                vista.solicitarNombreCliente();
                break;
            case 2:
                atenderCliente();
                break;
            case 3:
                System.out.println("Gracias por usar nuestros servicios ");
                System.exit(0);
            default:
                vista.mostrarMensaje("Opción incorrecta ");
        }
    }
    
    
    private void atenderCliente() {
        if (modelo.hayClientesEnEspera()) {
            Cliente cliente = modelo.atenderCliente();
            vista.mostrarMensaje("Atendiendo al cliente: " + cliente.getNombreCliente()+ " - Ticket: " + cliente.getNumeroTicket());
        } else {
            vista.mostrarMensaje("No hay clientes en espera.");
        }
    }
    
   
}
