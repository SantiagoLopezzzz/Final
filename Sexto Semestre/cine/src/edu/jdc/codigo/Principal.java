
package edu.jdc.codigo;

import edu.jdc.clases.peliculaUno;
import java.util.Scanner;


public class Principal {
    Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al cine ");
        System.out.println(" ");
        System.out.println("Esta es la cartelera ");
        
        int eleccionPelicula = 0;
        do {
            System.out.println("Ingrese el numero respectivo de la pelicula que desea ver  ");
            System.out.println(" 1.Pelicula 1 \n 2.Pelicula 2 \n 3.Pelicula 3 \n 4.Pelicula 4 ");
            eleccionPelicula = teclado.nextInt();
            if (eleccionPelicula == 1) {
                
                System.out.println("  Pelicula 1  ");
                teclado.nextLine();
                System.out.println(" ingrese la silla que desea ");
                int sillaSala = teclado.nextInt();
                System.out.println(" ingrese la hora que desea ");
                int horaEelicula = teclado.nextInt();
                System.out.println(" Pago con tarjeta o efectivo ");
                String precioPelicula = teclado.nextLine();

                peliculaUno miNuevaPelicula = new peliculaUno(sillaSala, horaEelicula, precioPelicula);
                
                System.out.println("");
                System.out.println("Silla sala: " + miNuevaPelicula.getSillaPelicula());
                System.out.println("Hora pelicula: " + miNuevaPelicula.getHoraPelicula());
                System.out.println("Precio pelicula: " + miNuevaPelicula.getPrecioPelicula());


            } else if (eleccionPelicula == 2) {

            }
            {
            }
        } while (eleccionPelicula != 5);
        System.out.println("Gracias por usar nuestros ");
    }
}
