package modelo;


public class Propietario {
    private String nombre;
    private String numeroIdentificacion;

    public Propietario(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
}
