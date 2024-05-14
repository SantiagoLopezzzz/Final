package edu.jdc.banco.vista;

import edu.jdc.banco.modelo.Cuenta;
import java.util.Scanner;


public class vistaCuenta {
    private Scanner leer;

    public vistaCuenta() {
        leer = new Scanner(System.in);

    }

    public int menu() {
        System.out.println(" Bienvenido a su banco ");
        System.out.println("  Digite 1 para ingresar dinero  ");
        System.out.println("  Digite 2 para retirar dinero  ");
        System.out.println("  Digite 3 para salir ");
        System.out.println("  Seleccione ");
        int opcion = leer.nextInt();
                leer.nextLine();
        return opcion;

    }

    public Cuenta registro() {
        System.out.println(" Ingrese su numero de usuario ");
        int idUsuario = leer.nextInt();
        System.out.println(" Ingrese su contraseña ");
        int contraseña = leer.nextInt();
        leer.nextLine();
        return new Cuenta(idUsuario, contraseña);
    }

    public void ingreso(Cuenta cuenta) {
        System.out.println(" Cuanto dinero desea ingresar ");
        int ingreso = leer.nextInt();
        if (ingreso == 0) {
            System.out.println(" No esta ingresando dinero ");
        } else {
            System.out.println(" Dinero ingresado " + ingreso);
            System.out.println(" Numero de usuario " + cuenta.getIdUsuario());
            System.out.println(" Gracias por usar nuestros servicios ");
            leer.nextLine();

        }
    }

    private void retito() {
        System.out.println(" Cuanto dinero desea ingresar ");
        
    }

    public void mensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
