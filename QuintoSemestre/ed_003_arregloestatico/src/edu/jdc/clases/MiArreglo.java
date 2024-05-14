//Sasaasasas
package edu.jdc.clases;
import edu.jdc.interfaces.Obligatorio;
import javax.swing.DefaultListModel;

public class MiArreglo implements Obligatorio {

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
        int i, tamano, valor;
        tamano = Aleatorio.numerito(tamanoMin, tamanoMax);
        arregloEnteros = new int [tamano];
        for ( i = 0; i < tamano; i++) {
            valor = Aleatorio.numerito(desde, hasta);
            arregloEnteros[i]=valor;
        }
        
        
    }

    @Override
    public void agregarElemento(int valor) {
        int i, tamano, arregloTemporal[];
        tamano = arregloEnteros.length;
        arregloTemporal = arregloEnteros;
        arregloEnteros = new int[tamano + 1];
        for (i = 0; i < tamano; i++) {
            arregloEnteros[i] = arregloTemporal[i];
        }
        arregloEnteros[tamano] = valor;


    }

    @Override
    public void eliminarElemento(DefaultListModel<String> salida) {
        int i, tamano, nuevoLimite, arregloTemporal[];
        tamano = arregloEnteros.length;
        if (tamano == 0) {
            salida.addElement("No hay elementos ");
        } else {
            arregloTemporal = arregloEnteros;
            nuevoLimite = tamano - 1;
            arregloEnteros = new int[nuevoLimite];
            for (i = 0; i < nuevoLimite; i++) {
                arregloEnteros[i] = arregloTemporal[i];
            }
            salida.addElement("Listo borre e imprima");
        }
    }
    @Override
    public void vaciarArreglo() {
        arregloEnteros = new int[0];
    }

}
