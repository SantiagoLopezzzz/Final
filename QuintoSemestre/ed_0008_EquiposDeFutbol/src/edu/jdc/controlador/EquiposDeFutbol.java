package edu.jdc.controlador;
import javax.swing.JOptionPane;
import edu.jdc.modelo.ValidarEquFutbol;
import edu.jdc.utilidad.Utilidades;
import edu.jdc.vista.FromEquipos;
import edu.jdc.interfaces.InterfaceEquiposFutbol;


public class EquiposDeFutbol implements InterfaceEquiposFutbol{

    
    private ValidarEquFutbol objetoValidador;
    private FromEquipos obPantallaPrincipal;    
    private String repec;
    private Utilidades obUtilidades;

    
    
    public EquiposDeFutbol(){
        objetoValidador = new ValidarEquFutbol();
        repec = "";
        obUtilidades= new Utilidades();
    }
    

    
    
    @Override
    public void llevar(String nombreJu, String edadJu, String alturaJu, String pesoJu) {
        repec =objetoValidador.validarLista(nombreJu,edadJu,alturaJu,pesoJu);
        JOptionPane.showMessageDialog(obPantallaPrincipal, repec);
        
    }

    @Override
    public void imprimir(int impresion) {
        
    } 

    public String getrepec() {
        return repec;
    }

    public void setrepec(String repec) {
        this.repec = repec;
    }
    
}
