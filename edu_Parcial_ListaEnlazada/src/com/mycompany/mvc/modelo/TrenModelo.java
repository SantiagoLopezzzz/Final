package com.mycompany.mvc.modelo;

/*
Autor: Santiago Lopez Fonseca 
Descripcio:Parcial 

 */
import java.util.ArrayList;

public class TrenModelo {

    private ArrayList<Integer> vagones;

    public TrenModelo() {
        vagones = new ArrayList<>();
    }

    public void agregarVagon(int dato) {
        vagones.add(dato);
    }

    public void desengancharVagon(int dato) {
        vagones.remove((Integer) dato);
    }

    public ArrayList<Integer> getVagones() {
        return vagones;
    }
}
