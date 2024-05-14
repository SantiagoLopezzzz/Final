package edu.jdc.vista;

import edu.jdc.modelo.Persona;
import java.util.Scanner;

public class Vista {
    public void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
        
    }
    
    public int solicitarOpcion (){
        Scanner scanner = new Scanner(System.in);
        
        mostrarMensaje("Bienvenido al Estadio ");
        mostrarMensaje("Ingrese la opcion que desea ");
        mostrarMensaje("1. Comprar boleta ");
        mostrarMensaje("2. Listar boletas ");
        mostrarMensaje("Borrar boleta ");
        mostrarMensaje("4. Salir");
        return scanner.nextInt();
        
    }
    
    public Persona solicitarDatos (){
       Scanner scanner = new Scanner(System.in);
       
        mostrarMensaje("Ingrese el nombre ");
        String nombre = scanner.nextLine();
        
        mostrarMensaje("Ingrese el numero de documento ");
        int numeroDocumento = scanner.nextInt();
        
        mostrarMensaje("Ingrese la edad ");
        int edad = scanner.nextInt();
        scanner.nextLine();
        
        mostrarMensaje("¿Es local o visitante ?");
        String tipoPersona = scanner.nextLine();
        boolean esLocal = tipoPersona.equalsIgnoreCase("local");
        
        mostrarMensaje("Ingrese el numero de la silla ");
        int numeroSilla = scanner.nextInt();
        
        
        return new Persona(nombre, numeroDocumento, edad, esLocal, numeroSilla);
        
    }
    
    
    public int solicitarNumeroDocumento (){
        Scanner scanner = new Scanner(System.in);
        mostrarMensaje("Ingrese el numero de documento de la boleta que desea eliminar ");
        return scanner.nextInt();
    }
    
    public void mostrarPersona (Persona persona){
        String tipoPersona = persona.EsLocal() ? "Local" : "Vistante";
        String mensaje = "Nombre " +persona.getNombre() +"\n"+
                "Numero de documento  " +persona.getNumeroDocumento()+"\n"+
                "Edad  " + (persona.esMenor() ? "Siendo menor debe entrar con un adulto ": "Puede ingresar")+"\n" +
                "Tipo de persona " + tipoPersona+"\n"+
                "Numero de silla " +persona.getNumeroSilla()+"\n"+
                "Cobro " +persona.cobrarTarifa();
        mostrarMensaje(mensaje);
        
    }
}
