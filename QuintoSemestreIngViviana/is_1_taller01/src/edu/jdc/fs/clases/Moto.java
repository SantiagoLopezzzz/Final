package edu.jdc.fs.clases;


public class Moto extends Vehiculo{
    private int CodMoto;
    private Marca marcaMoto;

    public Moto(int codigo, String marca, String modelo, String placa) {
    }

    public Moto(int CodMoto, Marca marcaMoto, String modeloVehiculo, String placaVehiculo, String colorVehiculo) {
        super(modeloVehiculo, placaVehiculo, colorVehiculo);
        this.CodMoto = CodMoto;
        this.marcaMoto = marcaMoto;
    }

    public int getCodMoto() {
        return CodMoto;
    }

    public void setCodMoto(int CodMoto) {
        this.CodMoto = CodMoto;
    }

    public Marca getMarcaMoto() {
        return marcaMoto;
    }

    public void setMarcaMoto(Marca marcaMoto) {
        this.marcaMoto = marcaMoto;
    }

    @Override
    public String toString() {
        return "Moto{" + "CodMoto=" + CodMoto + ", marcaMoto=" + marcaMoto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.CodMoto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Moto other = (Moto) obj;
        return this.CodMoto == other.CodMoto;
    }

    
    
    
}
