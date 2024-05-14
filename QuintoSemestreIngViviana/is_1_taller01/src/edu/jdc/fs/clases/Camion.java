package edu.jdc.fs.clases;


public class Camion extends Vehiculo{
    public int codeCamion;
    public int ejesCamion;
    public String tipoCargaCamion;

    public Camion() {
    }

    public Camion(int codeCamion, int ejesCamion, String tipoCargaCamion, String modeloVehiculo, String placaVehiculo, String colorVehiculo) {
        super(modeloVehiculo, placaVehiculo, colorVehiculo);
        this.codeCamion = codeCamion;
        this.ejesCamion = ejesCamion;
        this.tipoCargaCamion = tipoCargaCamion;
    }

   

    public int getCodeCamion() {
        return codeCamion;
    }

    public void setCodeCamion(int codeCamion) {
        this.codeCamion = codeCamion;
    }

    public int getEjesCamion() {
        return ejesCamion;
    }

    public void setEjesCamion(int ejesCamion) {
        this.ejesCamion = ejesCamion;
    }

    public String getTipoCargaCamion() {
        return tipoCargaCamion;
    }

    public void setTipoCargaCamion(String tipoCargaCamion) {
        this.tipoCargaCamion = tipoCargaCamion;
    }

    
    @Override
    public String toString() {
        return "Camion{" + "codeCamion=" + codeCamion + ", ejesCamion=" + ejesCamion + ", tipoCargaCamion=" + tipoCargaCamion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.codeCamion;
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
        final Camion other = (Camion) obj;
        return this.codeCamion == other.codeCamion;
    }
    
    
    
}
