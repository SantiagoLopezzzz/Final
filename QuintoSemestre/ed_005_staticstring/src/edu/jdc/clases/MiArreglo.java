package edu.jdc.clases;

import edu.jdc.interfaces.Obligatorio;
import javax.swing.DefaultListModel;

public class MiArreglo implements  Obligatorio {
    
    private String [] arregloTexto;
    
    public MiArreglo(int tamano) {
        arregloTexto = new String[tamano];
    }

    @Override
    public void agregarElemento(int posicion, String valor) {
        arregloTexto[posicion]= valor ;
    }

    @Override
    public void imprimir(DefaultListModel<String> salida) {
        int i, tamano;
        tamano = arregloTexto.length;
        if (tamano > 0) {
            salida.addElement("Ea ");
            for (i = 0;  i< tamano; i++) {
                salida.addElement("Arreglo [" + i +"]="+ arregloTexto[i]);
            }

        }
    }

    @Override
    public void crearAleatorio(int tamanoMin, int tamanoMax, int cantiCarateres) {
        int i, tamano;
        String valor;
        tamano = Aleatorio.numerito(tamanoMin, tamanoMax);
        arregloTexto = new String [tamano];
        for (i = 0;  i< tamano; i++) {
            valor = Aleatorio.textico(cantiCarateres);
            arregloTexto[i] = valor;
           
        }
        
    }

    @Override
    public void agregarElemento(String valor) {
        int i, tamano;
        String arregloTemporal[];
        tamano = arregloTexto.length;
        arregloTemporal = arregloTexto;
        arregloTexto = new String [tamano + 1]; 
        for (i = 0; i < tamano; i++) {
            arregloTexto[i] = arregloTemporal[i];           
        }
        arregloTexto[tamano]= valor;
        
    }

    @Override
    public void eliminarElemento(DefaultListModel<String> salida) {
        int i, tamano, nuevoLimite;
        String arregloTemporal[];
        tamano = arregloTexto.length;
        if (tamano == 0) {
            salida.addElement("No hay elementos");
        } else {
            arregloTemporal = arregloTexto;
            nuevoLimite = tamano -1;
            arregloTexto = new String[nuevoLimite];
            for (i = 0; i <nuevoLimite ; i++) {
                arregloTexto[i] = arregloTemporal[i];
            }
            salida.addElement("LIsto imprima ");
        }
        
    }

    @Override
    public void vaciarArreglo() {
        arregloTexto = new String [0];
    }
    
}
