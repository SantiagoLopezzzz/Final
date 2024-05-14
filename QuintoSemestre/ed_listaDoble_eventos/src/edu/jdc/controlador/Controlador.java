package edu.jdc.controlador;

import edu.jdc.modelo.Modelo;
import java.util.ArrayList;
import java.util.Iterator;

public class Controlador {
    private ArrayList<Modelo> listaEventos = new ArrayList<>();

    public void agregarEvento(Modelo evento) {
        listaEventos.add(evento);
    }

    public void eliminarEvento(int id) {
        Iterator<Modelo> iterator = listaEventos.iterator();
        while (iterator.hasNext()) {
            Modelo evento = iterator.next();
            if (evento.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    public void listarEventos() {
        for (Modelo evento : listaEventos) {
            System.out.println(evento.getId() + ": " + evento.getTipo() + " - Usuario: " +
                    evento.getIdUsuario() + " - Fecha y Hora: " + evento.getFechaHora() +
                    " - Contenido: " + evento.getContenido());
        }
    }
    
    
    
    
    
    public int obtenerIdUnico() {
        int id = 1;
        while (existeId(id)) {
            id++;
        }
        return id;
    }

    private boolean existeId(int id) {
        for (Modelo evento : listaEventos) {
            if (evento.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
