//Sasaasasas
package edu.jdc.controlador;


import javax.swing.DefaultListModel;
import edu.jdc.interfaces.ListaEquiposDeFutbol;

public class MiArreglo implements ListaEquiposDeFutbol {

    private int[] arregloEnteros;

    public MiArreglo(int tamano) {
        arregloEnteros = new int[tamano];

    }

    @Override
    public void agregarElemento(int posicion, int valor) {
        arregloEnteros [posicion]=valor;
    }

    @Override
    public void imprimir(DefaultListModel<String> salida) {
        int i, tamano;
        tamano = arregloEnteros.length;
        if (tamano > 0) {
            salida.addElement(" Uy ");
            for (i = 0; i < tamano; i++) {
                salida.addElement("Arreglo [" +i + "]="+arregloEnteros[i]);
            }
        } else {
        }

    
    }

    @Override
    public void crearAleatorio(int tamanoMin, int tamanoMax, int desde, int hasta) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void agregarElemento(int valor) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminarElemento(DefaultListModel<String> salida) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void vaciarArreglo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
