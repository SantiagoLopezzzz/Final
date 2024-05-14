package edu.jdc.controlador;

import edu.jdc.modelo.Persona;
import edu.jdc.vista.Vista;



public class Controlador {
    private Vista vista;
    private Persona primerPersona;

    public Controlador() {
        this.vista = new Vista();
        this.primerPersona = null;
    }
    
    public void agregarPersona (Persona nuevaPersona){
        if (primerPersona == null) {
            primerPersona = nuevaPersona;
            
        } else {
            Persona actual = primerPersona;
            while (actual.getSiguiente()!= null) {
                actual = actual.getSiguiente();
                
            }
            actual.setSiguiente(nuevaPersona);
        }
    }
    
    public void listarPersona (){
        Persona actual = primerPersona;
        while (actual != null) {
            vista.mostrarPersona(actual);
            actual = actual.getSiguiente();
            
        }
    }
    
    public void eliminarPersona (int numeroDocumento){
        if (primerPersona == null) {
            vista.mostrarMensaje("Esta vacia ");
            return;
        }
        if (primerPersona.getNumeroDocumento() == numeroDocumento) {
            primerPersona = primerPersona.getSiguiente();
            vista.mostrarMensaje("Eliminado ");
            return;
        }
        Persona anterior = primerPersona;
        Persona actual = primerPersona.getSiguiente();
        while (actual != null) {
            if (actual.getNumeroDocumento()== numeroDocumento) {
               anterior.setSiguiente(actual.getSiguiente());
               vista.mostrarMensaje("Eliminado");
               return;
            }
            anterior = actual;
            actual = actual.getSiguiente();
            
        }
        vista.mostrarMensaje("No se encontro ninguna boleta ");
    }
    
    
    public void procesarOpcion (int opcion){
        switch (opcion) {
            case 1:
                agregarPersona(vista.solicitarDatos());
                vista.mostrarMensaje("Se hizo la compra ");
                break;
            case 2:
                listarPersona();
                break;
            case 3:
                eliminarPersona(vista.solicitarNumeroDocumento());
                break;  
            case 4:
                vista.mostrarMensaje("Muchas gracias por sus servicios");
                System.exit(0);
                break;
            default:
                vista.mostrarMensaje("Opcion incorrecta");
        }
    }
    
    public  void iniciar (){
        while (true) {            
            int opcion = vista.solicitarOpcion();
            procesarOpcion(opcion);
        }
    }
}
