package edu.jdc.run;

import edu.jdc.controlador.Controlador;
import edu.jdc.vista.Vista;


public class Main {

    public static void main(String[] args) {
        String expresion = Vista.solicitarExpresion();
        String resultado = Ejecutor.ejecutarConversion(expresion);
        if (resultado.equals("Expresión inválida")) {
            Vista.imprimirError(resultado);
        } else {
            Vista.imprimirResultado(resultado);
        }
    }

    class Ejecutor {

        public static String ejecutarConversion(String expresion) {
            Controlador controlador = new Controlador();
            return controlador.convertirNotacionAPolaca(expresion);
        }
    }
}
