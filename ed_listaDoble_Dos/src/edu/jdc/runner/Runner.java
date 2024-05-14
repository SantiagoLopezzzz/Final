package edu.jdc.runner;

import edu.jdc.controlador.SecuenciaEventos;
import edu.jdcvista.EventoView;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        SecuenciaEventos secuenciaEventos = new SecuenciaEventos();
        EventoView eventoView = new EventoView(secuenciaEventos, new Scanner(System.in));

        eventoView.mostrarMenu();
    }
}
