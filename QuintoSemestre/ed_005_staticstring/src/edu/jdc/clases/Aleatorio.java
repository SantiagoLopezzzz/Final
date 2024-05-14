package edu.jdc.clases;

import java.util.Random;

public class Aleatorio {

    public static int numerito(int inicio, int fin) {
        int valor;
        Random aleato = new Random();
        valor = aleato.nextInt(inicio, fin + 1);
        return valor;
    }

    public static String textico(int cantidadDeCaracteres) {
        char caracter;
        String cadenita, diccionario;
        int i, posicion, limiteDiccionario;
        cadenita = "";
        diccionario = "asdfghjklñ";
        limiteDiccionario = diccionario.length() - 1;
        for (i = 0; i < cantidadDeCaracteres; i++) {
            posicion = numerito(0, limiteDiccionario);
            caracter = diccionario.charAt(posicion);
            cadenita = cadenita + caracter;

        }

        return cadenita;

    }

}
