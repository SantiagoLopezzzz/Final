package edu.jdc.controlador;

import edu.jdc.interfaces.InterfaceEquiposDeFutbol;
import edu.jdc.listas.MiNodo;
import javax.swing.DefaultListModel;

public class EquiposDeFutbol implements InterfaceEquiposDeFutbol{

    private String[] arreglo;
    private MiNodo cabeza;

    public EquiposDeFutbol(int tamano){
        arreglo = new String[tamano];
    }
    public EquiposDeFutbol() {
        inicio();
    }
    
    public void inicio (){
       cabeza = null; 
    }
    
    
    @Override
    public void restearlista() {
        inicio();
    }

    @Override
    public int obtenerTamano() {
        int cant = 0;
        MiNodo temporal = cabeza;
        while (temporal!= null ) {
            temporal = temporal.getSiguiente();
            cant++;
        }
        return cant;
        
    }

        
//        MiNodo nuevoNodo = new MiNodo();
//        nuevoNodo.setDato(dato);
//        if (cabeza == null) {
//            cabeza = nuevoNodo;
//        } else {
//            MiNodo temporal = cabeza;
//            while (temporal.getSiguiente()!= null) {
//                temporal = temporal.getSiguiente();  
//            }
//            temporal.setSiguiente(nuevoNodo);
//        }
        
//    }

    @Override
    public void imprimirLista(DefaultListModel<String> salida) {
        int i, tamano;
        tamano = arreglo.length;
        if (tamano > 0) {
            salida.addElement("Equipo ");
            for (i = 0; i < tamano; i++) {
                salida.addElement("Jugador numero [" + i + "]=" + arreglo[i]);
            }
        }
    }
    


    @Override
    public void agregarElem(Object dato, String valor) {
    int i, tamano;
            String arregloTemporal[];
        tamano = arreglo.length;
        arregloTemporal = arreglo;
        arreglo = new String [tamano + 1];
        for (i = 0; i < tamano; i++) {
            arreglo[i] = arregloTemporal[i];
        }
        arreglo[tamano] = valor;
    }

    @Override
    public void agregarElem(int posicion, String valor) {
         arreglo[posicion]= valor;
    }
    

}
