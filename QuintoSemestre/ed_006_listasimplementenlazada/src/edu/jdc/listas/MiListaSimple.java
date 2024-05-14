
package edu.jdc.listas;

import edu.jdc.interfaces.ListaSimple;
import java.time.temporal.Temporal;
import javax.swing.DefaultListModel;

public class MiListaSimple implements ListaSimple{
    
    private MINodo cabeza;

    public MiListaSimple() {
        cabeza = null;
    }

    @Override
    public void restearlista() {
        cabeza = null;
    }
    

    @Override
    public int obtenerTamano() {
        int cant=0;
        MINodo temporal = cabeza;
        while (temporal!= null) {
            temporal = temporal.getSiguiente();
            cant ++;
            
        }
        return cant;
        
    }

    @Override
    public void agregar(Object dato) {
        MINodo nuevoNodo = new MINodo();
        nuevoNodo.setDato(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
           MINodo temporal = cabeza;
            while (temporal.getSiguiente()!= null ) {
                temporal = temporal.getSiguiente();
            }
            temporal.setSiguiente(nuevoNodo);
        }
        
    }

    @Override
    public void agregar(int posicion, Object dato) {
    }

    @Override
    public void imprimirLista(DefaultListModel<String> salida) {
    }

    @Override
    public MINodo eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public MINodo eliminar(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public MINodo encontrarPosicion(int posicion) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void actualizarPosicion(int posicion, Object datoNuevo) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
