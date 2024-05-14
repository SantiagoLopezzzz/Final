package edu.jdc.utilidad;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Utilidades {

    private List<String> equipoUno;
    private List<String> equipoDos;
    private List<String> equipoTres;
    private List<String> descartados;
    private String chequeo;
    private int banderaUno;
    private int banderDos;
    private int banderaTres;
    private int banderaCu;

    
    public Utilidades(){
        equipoUno = new ArrayList<>();
        equipoDos = new ArrayList<>();
        equipoTres = new ArrayList<>();
        descartados = new ArrayList<>();
        chequeo = "";

        banderaCu = 0;
        banderDos = 0;
        banderaTres = 0;
    }

    public String equipoUno(String lista){
        equipoUno.add(lista);
        chequeo="se añadio al equipo uno";
   
        for(int i=0;i<equipoUno.size();i++){
        String impre= equipoUno.get(i);
        JOptionPane.showMessageDialog(null, impre);
        }
        return chequeo;
    }
    public String equipoDos(String lista){
        equipoDos.add(lista);
        banderDos=1;
        chequeo="se añadio al equipo Dos";
        for(int i=0;i<equipoDos.size();i++){
        String impre= equipoDos.get(i);
        
        JOptionPane.showMessageDialog(null, impre);
        }
        return chequeo;
    }
    public String equipoTres(String lista){
        equipoTres.add(lista);
        banderaTres=1;
        chequeo="se añadio al equipo tres";
        for(int i=0;i<equipoTres.size();i++){
        String impre= equipoTres.get(i);
        JOptionPane.showMessageDialog(null, impre);
        }
        return chequeo;
    }
    public String descartados(String lista){
        descartados.add(lista);
        banderaCu=1;
        chequeo="se añadio a descartados";
        for(int i=0;i<descartados.size();i++){
        String impre= descartados.get(i);
        JOptionPane.showMessageDialog(null, impre);
        }
        return chequeo;
    }
    
}
    
    
    
        

