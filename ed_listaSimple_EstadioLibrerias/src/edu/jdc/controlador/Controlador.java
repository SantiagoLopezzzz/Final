package edu.jdc.controlador;

import edu.jdc.modelo.Persona;
import edu.jdc.vista.Vista;
import java.util.ArrayList;


public class Controlador {
    private Vista vista;
    private ArrayList<Persona> personas;

    public Controlador() {
        this.vista = new Vista();
        this.personas = new ArrayList<>();
        
    }
    public void agregarPersonas (Persona persona){
        personas.add(persona);
    }
    
    public void listarPersonas(){
        for (Persona persona : personas) {
            vista.mostrarPersona(persona);
        }
    }
    
    public void eliminarPersona (int numeroDocumento){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNumeroDocumento() == numeroDocumento) {
                personas.remove(i);
                vista.mostrarMensaje("Se elimino la boleta ");
                return;
            }
        }
        vista.mostrarMensaje("Las boletas estan vacias ");
    }
    
    public void procesarOpcion (int opcion){
        switch (opcion) {
            case 1:
                agregarPersonas(vista.solicitarDatos());
                vista.mostrarMensaje("Se hizo la compra ");
                break;
            case 2:
                listarPersonas();
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
