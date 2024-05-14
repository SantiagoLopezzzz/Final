package com.mycompany.mvc.controlador;

/*
Autor: Santiago Lopez Fonseca 
Descripcio:Parcial 

 */
import com.mycompany.mvc.modelo.TrenModelo;
import com.mycompany.mvc.vista.TrenVista;
import java.util.ArrayList;

public class TrenControlador {

    private TrenModelo modelo;
    private TrenVista vista;

    public TrenControlador() {

    }

    public TrenControlador(TrenModelo modelo, TrenVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarVagon() {
        int dato = vista.solicitarDato();
        modelo.agregarVagon(dato);
    }

    public void desengancharVagon() {
        int dato = vista.solicitarDato();
        modelo.desengancharVagon(dato);
    }

    public void imprimirTren() {
        ArrayList<Integer> vagones = modelo.getVagones();
        vista.imprimirTren(vagones);
    }
}
