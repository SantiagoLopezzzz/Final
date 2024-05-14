package modelo;


public class Multa {
    private String descripcion;
    private double monto;
    private Vehiculo vehiculo;
    private Propietario propietario;

    public Multa(String descripcion, double monto, Vehiculo vehiculo, Propietario propietario) {
        this.descripcion = descripcion;
        this.monto = monto;
        this.vehiculo = vehiculo;
        this.propietario = propietario;
    }

    // Getters para la información de la multa
    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}
