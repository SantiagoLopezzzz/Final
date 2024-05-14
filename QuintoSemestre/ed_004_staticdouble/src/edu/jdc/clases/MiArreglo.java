package edu.jdc.clases;

import edu.jdc.interfaces.Obligatorio;
import javax.swing.DefaultListModel;

public class MiArreglo implements Obligatorio {

    private double[] arregloDobles;

    public MiArreglo(int tamano) {
        arregloDobles = new double[tamano];

    }

    @Override
    public void agregarElemento(int posicion, double valor) {
        arregloDobles[posicion] = valor;
    }

    @Override
    public void imprimir(DefaultListModel<String> salida) {
        int i, tamano;
        tamano = arregloDobles.length;
        if (tamano > 0) {
            salida.addElement(" Uy ");
            for (i = 0; i < tamano; i++) {
                salida.addElement("Arreglo [" + i + "]=" + arregloDobles[i]);
            }

        }

    }

    @Override
    public void crearAleatorio(int tamanoMin, int tamanoMax, double desde, double hasta) {
        int i, tamano;
        double valor;
        tamano = Aleatorio.numerito(tamanoMin, tamanoMax);
        arregloDobles = new double[tamano];
        for (i = 0; i < tamano; i++) {
            valor = Aleatorio.numeritoDoble(desde, hasta);
            arregloDobles[i] = valor;
        }

    }

    @Override
    public void agregarElemento(double valor) {
        int i, tamano;
        double arregloTemporal[];
        tamano = arregloDobles.length;
        arregloTemporal = arregloDobles;
        arregloDobles = new double[tamano + 1];
        for (i = 0; i < tamano; i++) {
            arregloDobles[i] = arregloTemporal[i];
        }
        arregloDobles[tamano] = valor;
    }

    @Override
    public void eliminarElemento(DefaultListModel<String> salida) {
        int i, tamano, nuevoLimite;
        double arregloTemporal[];
        tamano = arregloDobles.length;
        if (tamano == 0) {
            salida.addElement("No hay elementos ");
        } else {
            arregloTemporal = arregloDobles;
            nuevoLimite = tamano - 1;
            arregloDobles = new double[nuevoLimite];
            for (i = 0; i < nuevoLimite; i++) {
                arregloDobles[i] = arregloTemporal[i];
            }
            salida.addElement("Listo borre e imprima");
        }

    }

    @Override
    public void vaciarArreglo() {
        arregloDobles = new double[0];
    }
}
