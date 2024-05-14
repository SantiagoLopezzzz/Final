package edu.jdc.controlador;

import edu.jdc.modelo.Evento;
import edu.jdc.modelo.NodoEvento;



public class SecuenciaEventos {
    private NodoEvento head;

    public void agregarEvento(Evento evento) {
        NodoEvento nuevoNodo = new NodoEvento(evento);
        if (head == null) {
            head = nuevoNodo;
        } else {
            NodoEvento nuevo = head;
            while (nuevo.next != null) {
                nuevo = nuevo.next;
            }
            nuevo.next = nuevoNodo;

        }

    }
    
    public boolean eliminarEvento(int eventoId) {
        NodoEvento current = head;
        while (current != null) {
            if (current.evento.getEventoId() == eventoId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public Evento[] buscarEventos(String tipo, int usuarioId) {
        NodoEvento current = head;
        Evento[] resultados = new Evento[100];
        int count = 0;

        while (current != null) {
            if ((tipo == null || current.evento.getTipo().equals(tipo)) &&
                    (usuarioId == 0 || current.evento.getUsuarioId() == usuarioId)) {
                resultados[count++] = current.evento;
            }
            current = current.next;
        }

        return resultados;
    }
    
    public Evento[] obtenerTodosEventos() {
        NodoEvento current = head;
        Evento[] todosEventos = new Evento[100];
        int count = 0;

        while (current != null) {
            todosEventos[count++] = current.evento;
            current = current.next;
        }

        return todosEventos;
    }
    
    
    
    
    
}
