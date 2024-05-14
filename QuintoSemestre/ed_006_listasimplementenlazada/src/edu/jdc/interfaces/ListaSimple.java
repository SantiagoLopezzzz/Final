package edu.jdc.interfaces;

import edu.jdc.listas.MINodo;
import javax.swing.DefaultListModel;

public interface ListaSimple {
    
    public void restearlista ();
    
    public int obtenerTamano ();
    
    public void agregar (Object dato);
    
    public void agregar (int posicion, Object dato);
    
    public void imprimirLista (DefaultListModel <String> salida);
    
    public MINodo eliminar ();
    
    public MINodo eliminar (int posicion );
    
    public MINodo encontrarPosicion (int posicion);
    
    public void actualizarPosicion (int posicion, Object datoNuevo);
}
    
    
    
//Falta la mitad jajaj