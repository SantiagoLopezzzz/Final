package edu.jdc.controller;

import edu.jdc.model.Llaves;
import edu.jdc.model.modelLaberinto;
import edu.jdc.vista.Vista;


public class Controlador {
    
    private modelLaberinto objecModel;
    private Vista objectVista;
    
    public Controlador() {
        
    }

    public Controlador(modelLaberinto objecModel, Vista objectVista) {
        this.objecModel = objecModel;
        this.objectVista = objectVista;
        inicializar();
    }
    
    
    public void inicializar (){

    }
    
}
