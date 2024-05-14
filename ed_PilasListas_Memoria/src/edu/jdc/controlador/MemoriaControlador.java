package edu.jdc.controlador;

import edu.jdc.modelo.MemoriaModelo;
import edu.jdc.vista.MemoriaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemoriaControlador {
    private MemoriaModelo modelo;
    private MemoriaVista vista;

    public MemoriaControlador(MemoriaModelo modelo, MemoriaVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        this.vista.agregarListenerAsignar(new AsignarListener());
        this.vista.agregarListenerLiberar(new LiberarListener());
        this.vista.agregarListenerListar(new ListarListener());

        actualizarVista();
    }

    class AsignarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nombre = vista.getNombreVariable();
            int tamaño = vista.getTamañoVariable();
            modelo.asignarVariable(nombre, tamaño);
            actualizarVista();
        }
    }

    class LiberarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            modelo.liberarUltimaVariable();
            actualizarVista();
        }
    }

    class ListarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vista.mostrarMemoria(modelo.getInicio());
        }
    }

    private void actualizarVista() {
        vista.mostrarMemoria(modelo.getInicio());
    }
}

