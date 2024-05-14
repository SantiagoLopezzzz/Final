package modelo;


public class Vehiculo {
    private String modelo;
    private String color;
    private String numeroPlaca;

    public Vehiculo(String modelo, String color, String numeroPlaca) {
        this.modelo = modelo;
        this.color = color;
        this.numeroPlaca = numeroPlaca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }
}
