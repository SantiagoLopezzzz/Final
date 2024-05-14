package run;

import controlador.ControladorMultas;
import vista.VistaMultas;


public class Main {
    public static void main(String[] args) {
        ControladorMultas controlador = new ControladorMultas();
        VistaMultas vista = new VistaMultas(controlador);

        // Mostrar menú y agregar multa
        vista.mostrarMenu();

        // Mostrar multas
        vista.mostrarMultas();

        // Generar archivo de texto
        vista.generarArchivoTxt("multas.txt");
    }
}
