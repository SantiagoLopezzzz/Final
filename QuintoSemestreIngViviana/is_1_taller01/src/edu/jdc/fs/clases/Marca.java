package edu.jdc.fs.clases;


public class Marca{
    
    
    private int codMarca;
    private String nombreMarca;

    public Marca() {
    }

    public Marca(int codMarca, String nombreMarca) {
        this.codMarca = codMarca;
        this.nombreMarca = nombreMarca;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
    
    
 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.codMarca;
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
        final Marca other = (Marca) obj;
        return this.codMarca == other.codMarca;
    }
    
    
    
    
    
    
}
