package edu.jdc.vista;

import java.util.Scanner;


public class Vista {
    
    public static String solicitarExpresion (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la expresion matematica ");
        return scanner.nextLine();
        
    }
    
    public static void imprimirResultado (String resultado){
        System.out.println("Imprimir resultado "+ resultado);
    }
    
    public static void imprimirError (String error){
        System.out.println("Error "+ error);
    }
}
