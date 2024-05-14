package edu.jdc.fs.clases;


public class Vehiculo {

    private String modeloVehiculo;
    private String placaVehiculo;
    private String colorVehiculo;
    
    public Vehiculo() {
        
    }

    public Vehiculo(String modeloVehiculo, String placaVehiculo, String colorVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
        this.placaVehiculo = placaVehiculo;
        this.colorVehiculo = colorVehiculo;
    }

    
    
 
    
    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }


    @Override
    public String toString() {
        return "Vehiculo{" + "modeloVehiculo=" + modeloVehiculo + ", placaVehiculo=" + placaVehiculo + ", colorVehiculo=" + colorVehiculo + '}';
    }
    
    
    
            
}
