package controlador;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import modelo.ColaMultas;
import modelo.Multa;
import modelo.Propietario;
import modelo.Vehiculo;


public class ControladorMultas {
    private ColaMultas colaMultas;

    public ControladorMultas() {
        colaMultas = new ColaMultas();
    }

    public void agregarMulta(String descripcion, double monto, Vehiculo vehiculo, Propietario propietario) {
        Multa multa = new Multa(descripcion, monto, vehiculo, propietario);
        colaMultas.encolar(multa);
    }

    public List<Multa> obtenerMultas() {
        return colaMultas.getMultas();
    }

    public void generarArchivoTxt(String nombreArchivo) {
        try {
            FileWriter archivo = new FileWriter(nombreArchivo);
            for (Multa multa : colaMultas.getMultas()) {
                archivo.write("Descripción: " + multa.getDescripcion() + "\n");
                archivo.write("Monto: " + multa.getMonto() + "\n");
                archivo.write("Modelo: " + multa.getVehiculo().getModelo() + "\n");
                archivo.write("Color: " + multa.getVehiculo().getColor() + "\n");
                archivo.write("Número de placa: " + multa.getVehiculo().getNumeroPlaca() + "\n");
                archivo.write("Nombre del propietario: " + multa.getPropietario().getNombre() + "\n");
                archivo.write("Número de identificación: " + multa.getPropietario().getNumeroIdentificacion() + "\n\n");
            }
            archivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
