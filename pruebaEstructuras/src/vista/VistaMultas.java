package vista;

import controlador.ControladorMultas;
import java.util.List;
import java.util.Scanner;
import modelo.Multa;
import modelo.Propietario;
import modelo.Vehiculo;


public class VistaMultas {
    private ControladorMultas controlador;
    private Scanner scanner;

    public VistaMultas(ControladorMultas controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Seleccione el tipo de multa:");
        System.out.println("1. Estacionamiento en lugar prohibido");
        System.out.println("2. Exceso de velocidad");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
            case 1:
                agregarMulta("Estacionamiento en lugar prohibido", 50);
                break;
            case 2:
                agregarMulta("Exceso de velocidad", 100);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    public void agregarMulta(String descripcion, double monto) {
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese el color del vehículo: ");
        String color = scanner.nextLine();
        System.out.print("Ingrese el número de placa del vehículo: ");
        String numeroPlaca = scanner.nextLine();
        System.out.print("Ingrese el nombre del propietario: ");
        String nombrePropietario = scanner.nextLine();
        System.out.print("Ingrese el número de identificación del propietario: ");
        String numeroIdentificacion = scanner.nextLine();
        System.out.println("");

        Vehiculo vehiculo = new Vehiculo(modelo, color, numeroPlaca);
        Propietario propietario = new Propietario(nombrePropietario, numeroIdentificacion);

        controlador.agregarMulta(descripcion, monto, vehiculo, propietario);
    }

    public void mostrarMultas() {
        List<Multa> multas = controlador.obtenerMultas();
        for (Multa multa : multas) {
            System.out.println("Descripción: " + multa.getDescripcion());
            System.out.println("Monto: " + multa.getMonto());
            System.out.println("Modelo: " + multa.getVehiculo().getModelo());
            System.out.println("Color: " + multa.getVehiculo().getColor());
            System.out.println("Número de placa: " + multa.getVehiculo().getNumeroPlaca());
            System.out.println("Nombre del propietario: " + multa.getPropietario().getNombre());
            System.out.println("Número de identificación: " + multa.getPropietario().getNumeroIdentificacion() + "\n");
        }
    }

    public void generarArchivoTxt(String nombreArchivo) {
        controlador.generarArchivoTxt(nombreArchivo);
        System.out.println("Archivo generado exitosamente: " + nombreArchivo);
    }
}
