package edu.jdc.modelo;

import javax.swing.JOptionPane;
import edu.jdc.utilidad.Utilidades;

public class ValidarEquFutbol {

    private Utilidades obUtilidades;
    private String repu;
    int ImpresionUno;
    int ImpresionDos;
    int Impresiontres;
    int descartados;

    public ValidarEquFutbol() {
        obUtilidades = new Utilidades();
        repu = "";
        ImpresionUno = 0;
        ImpresionDos = 0;
        Impresiontres = 0;
        descartados = 0;

    }

    public String validarLista(String nombre, String edad, String altura, String peso) {
        String lista = "Fue inscrito " + nombre + " El peso " + peso + " su edad " + edad + " su altura " + altura;
        int edadRecibida = Integer.parseInt(edad);
        int PesoRecibida = Integer.parseInt(peso);
        int alturaRecibida = Integer.parseInt(altura);
        ImpresionUno = 0;
        ImpresionDos = 0;
        Impresiontres = 0;
        descartados = 0;
        
        //equipo 3 mayor 170
        if (alturaRecibida >= 170 ) {
            Impresiontres = 1;
            repu = obUtilidades.equipoTres(lista);
        }
        //equipo uno de 18 a 23 años
        if (edadRecibida >= 18 && edadRecibida <= 23) {
            ImpresionUno = 1;
            repu = obUtilidades.equipoUno(lista);
            
        //equipo dos de mayor de 23 peso igual o mayor de 70 kilos    
        } else if (edadRecibida > 23 && PesoRecibida <= 70) {
            ImpresionDos = 1;
            repu = obUtilidades.equipoDos(lista);
            
        //Descartes     
        } else if (ImpresionDos == 0 && ImpresionUno == 0 && Impresiontres == 0) {
            repu = obUtilidades.descartados(lista);
        }
        return repu;
    }


    public int getImpresionUno() {
        return ImpresionUno;
    }

    public void setImpresionUno(int ImpresionUno) {
        this.ImpresionUno = ImpresionUno;
    }

    public int getImpresionDos() {
        return ImpresionDos;
    }

    public void setImpresionDos(int ImpresionDos) {
        this.ImpresionDos = ImpresionDos;
    }

    public int getImpresiontres() {
        return Impresiontres;
    }

    public void setImpresiontres(int Impresiontres) {
        this.Impresiontres = Impresiontres;
    }

    public int getDescartados() {
        return descartados;
    }

    public void setDescartados(int descartados) {
        this.descartados = descartados;
    }

}
