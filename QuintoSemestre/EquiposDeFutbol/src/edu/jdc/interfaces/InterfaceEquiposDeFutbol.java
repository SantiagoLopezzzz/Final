package edu.jdc.interfaces;

import javax.swing.DefaultListModel;

public interface InterfaceEquiposDeFutbol {
   public void restearlista ();
    
    public int obtenerTamano ();
    
    public void agregarElem (Object dato, String valor);

    public void agregarElem (int  posicion, String valor);
    
    public void imprimirLista (DefaultListModel <String> salida);
    
    
//    public MINodo eliminar ();
    
    

    
}
