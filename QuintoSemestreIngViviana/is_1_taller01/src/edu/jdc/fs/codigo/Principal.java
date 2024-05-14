package edu.jdc.fs.codigo;

import edu.jdc.fs.clases.Camion;
import edu.jdc.fs.clases.Moto;
import java.util.Scanner;

public class Principal {

    Scanner miTecaldote = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner miTecaldote = new Scanner(System.in);
        System.out.println("Bienvenidos  a MI SOTWARE ");

        int tipovehiculo = 0;

        do {
            System.out.println("¿que tipo de vehiculo decea inscribir?\n 1)moto\n 2)camion \n 3)salir  ");
            tipovehiculo = miTecaldote.nextInt();
            if (tipovehiculo == 1) {
                System.out.println(" CREANDO MOTO  ");
                miTecaldote.nextLine();
                System.out.println(" ingrese una marca ");
                String marca = miTecaldote.nextLine();

                System.out.println(" ingrese el color  ");
                String color = miTecaldote.nextLine();

                System.out.println(" ingrese la placa  ");
                String placa = miTecaldote.nextLine();

                System.out.println(" ingrese el modelo ");
                String modelo = miTecaldote.nextLine();

                System.out.println(" creando ");
                Moto miNuevaMoto = new Moto(1, marca, modelo, placa);
                System.out.println("-----ESTA ES LA MOTO-----");

                System.out.println("Marca: " + miNuevaMoto.getMarcaMoto());
                System.out.println("placa: " + miNuevaMoto.getPlacaVehiculo());
                System.out.println("color: " + miNuevaMoto.getColorVehiculo());
                System.out.println("modelO: " + miNuevaMoto.getModeloVehiculo());

            } else if (tipovehiculo == 2) {

                System.out.println("-----CREANDO CAMION---- ");

                System.out.println("***ingrese el numero de ejes***");
                int ejesCamion = miTecaldote.nextInt();
                miTecaldote.nextLine();
                System.out.println("***ingrese el tipo de carga***");
                String tipoCarga = miTecaldote.nextLine();

                miTecaldote.nextLine();

                System.out.println(" Codigo camion ");
                int codCamion = miTecaldote.nextInt();
                miTecaldote.nextLine();

                System.out.println("  ingrese el color ");
                String colorCamion = miTecaldote.nextLine();

                System.out.println(" ingrese la placa  ");
                String placaCamion = miTecaldote.nextLine();

                System.out.println(" ingrese el modelo ");
                String modeloCamion = miTecaldote.nextLine();

                Camion miNuevoCamion = new Camion(codCamion, ejesCamion, tipoCarga, modeloCamion, placaCamion, colorCamion);

                System.out.println("-----ESTE ES EL CAMION-----");
                System.out.println("codigo Camion: " + miNuevoCamion.getCodeCamion());
                System.out.println("Nuemero de ejes: " + miNuevoCamion.getEjesCamion());
                System.out.println("tipo carga: " + miNuevoCamion.getTipoCargaCamion());
                System.out.println("Placa: " + miNuevoCamion.getPlacaVehiculo());
                System.out.println("modelo: " + miNuevoCamion.getModeloVehiculo());
                System.out.println("Color: " + miNuevoCamion.getColorVehiculo());

            } else if (tipovehiculo <= 0 && tipovehiculo >= 4) {
                System.out.println("verifica el numero ingresado");

            }

        } while (tipovehiculo != 3);

        System.out.println(" GRACIAS ");
    }
}
