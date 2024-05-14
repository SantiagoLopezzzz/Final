package edu.jdc.controlador;

import edu.jdc.modelo.Modelo;
import java.util.LinkedList;

public class Controlador {
    private LinkedList<Modelo> historial;
    private int indiceActual;

    public Controlador() {
        historial = new LinkedList<>();
        indiceActual = -1; 
    }

    public void visitarPagina(Modelo pagina) {
        
        while (indiceActual < historial.size() - 1) {
            historial.removeLast();
        }
        historial.add(pagina);
        indiceActual++;
    }

    public Modelo retroceder() {
        if (indiceActual > 0) {
            indiceActual--;
            return historial.get(indiceActual);
        }
        return null; 
    }

    public Modelo avanzar() {
        if (indiceActual < historial.size() - 1) {
            indiceActual++;
            return historial.get(indiceActual);
        }
        return null; 
    }

    public Modelo getPaginaActual() {
        if (indiceActual >= 0 && indiceActual < historial.size()) {
            return historial.get(indiceActual);
        }
        return null;
    }

    public LinkedList<Modelo> getHistorial() {
        return historial;
    }
}
