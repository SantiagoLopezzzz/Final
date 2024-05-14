
package edu.jdc.clases;

public class peliculaUno extends peliculas{
    private int CodPelicula;

    public peliculaUno() {
    }

    public peliculaUno(int sillaPelicula, int horaPelicula, String precioPelicula) {
        super(sillaPelicula, horaPelicula, precioPelicula);
    }

    public int getCodPelicula() {
        return CodPelicula;
    }

    public void setCodPelicula(int CodPelicula) {
        this.CodPelicula = CodPelicula;
    }

    @Override
    public String toString() {
        return "peliculaUno{" + "CodPelicula=" + CodPelicula + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.CodPelicula;
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
        final peliculaUno other = (peliculaUno) obj;
        return this.CodPelicula == other.CodPelicula;
    }

    


    
    
}
