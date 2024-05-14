
package edu.jdc.clases;

public class peliculas {
    private int sillaPelicula;
    private int horaPelicula;
    private String precioPelicula;

    public peliculas() {
    }

    public peliculas(int sillaPelicula, int horaPelicula, String precioPelicula) {
        this.sillaPelicula = sillaPelicula;
        this.horaPelicula = horaPelicula;
        this.precioPelicula = precioPelicula;
    }


    public int getSillaPelicula() {
        return sillaPelicula;
    }

    public void setSillaPelicula(int sillaPelicula) {
        this.sillaPelicula = sillaPelicula;
    }

    public int getHoraPelicula() {
        return horaPelicula;
    }

    public void setHoraPelicula(int horaPelicula) {
        this.horaPelicula = horaPelicula;
    }

    public String getPrecioPelicula() {
        return precioPelicula;
    }

    public void setPrecioPelicula(String precioPelicula) {
        this.precioPelicula = precioPelicula;
    }

    @Override
    public String toString() {
        return "peliculas{" + "sillaPelicula=" + sillaPelicula + ", horaPelicula=" + horaPelicula + ", precioPelicula=" + precioPelicula + '}';
    }


    
}
