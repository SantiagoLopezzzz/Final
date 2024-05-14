/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.clases;

import java.util.Random;

public class Aleatorio {
    
    public static int numerito (int inicio, int fin){
        int valor;
        Random aleato = new Random();
        valor = aleato.nextInt(inicio, fin);
        return valor;
        
    }

}

