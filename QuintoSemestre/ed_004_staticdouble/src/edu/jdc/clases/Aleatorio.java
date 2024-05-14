package edu.jdc.clases;

import java.util.Random;

public class Aleatorio {
    public static int numerito(int inicio, int fin) {
        int valor;
        Random aleato = new Random();
        valor = aleato.nextInt( inicio,  fin +1);
        return valor;
    }
        public static double numeritoDoble (double desde, double hasta){
         double valor;
        Random aleato = new Random();
        valor = aleato.nextDouble(desde, hasta+1 );
        return valor;
        
    }
}
