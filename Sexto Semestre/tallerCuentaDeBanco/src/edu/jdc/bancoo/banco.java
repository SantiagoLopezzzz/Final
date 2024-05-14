
package edu.jdc.bancoo;

import edu.jdc.banco.controlador.controladorCuenta;
import edu.jdc.banco.vista.vistaCuenta;


public class banco {

    public static void main(String[] args) {
        vistaCuenta vista = new vistaCuenta();
        controladorCuenta controlador = new controladorCuenta(vista);
        controlador.Iniciar();
    }
    
    
    
}
