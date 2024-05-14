package edu.jdc.controlador;

import edu.jdc.modelo.PaginaWeb;
import java.util.LinkedList;


public class HistorialNavegacion {

   private LinkedList<PaginaWeb> historial;
    private int indiceActual;

    public HistorialNavegacion() {
        historial = new LinkedList<>();
        indiceActual = -1; 
    }

    public void visitarPagina(PaginaWeb pagina) {
        
        while (indiceActual < historial.size() - 1) {
            historial.removeLast();
        }
        historial.add(pagina);
        indiceActual++;
    }

    public PaginaWeb retroceder() {
        if (indiceActual > 0) {
            indiceActual--;
            return historial.get(indiceActual);
        }
        return null; 
    }

    public PaginaWeb avanzar() {
        if (indiceActual < historial.size() - 1) {
            indiceActual++;
            return historial.get(indiceActual);
        }
        return null; 
    }

    public PaginaWeb getPaginaActual() {
        if (indiceActual >= 0 && indiceActual < historial.size()) {
            return historial.get(indiceActual);
        }
        return null;
    }

    public LinkedList<PaginaWeb> getHistorial() {
        return historial;
    }
}
