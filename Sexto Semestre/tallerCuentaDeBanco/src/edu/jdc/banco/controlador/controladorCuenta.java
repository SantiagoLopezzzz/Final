package edu.jdc.banco.controlador;

import edu.jdc.banco.modelo.Cuenta;
import edu.jdc.banco.vista.vistaCuenta;


public class controladorCuenta {
    private vistaCuenta vista;
    private Cuenta cuenta;
    private Cuenta ingreso;

 

    public controladorCuenta(vistaCuenta vista) {
        this.vista = vista;

    }
    
    
    public void Iniciar (){
        boolean salir = false;
        while (!salir) {
           int opcion = vista.menu();
            switch (opcion) {
                case 1:
                    this.cuenta = vista.registro();
                    vista.ingreso(cuenta);
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    salir = true;
                    vista.mensaje("Gracias por usar nuestros sevicios");
                    break;
                    
                default:
                    vista.mensaje("Opcion no valida ingrese nuevamente");
            }
        
            
        }
    }
    
    
}
