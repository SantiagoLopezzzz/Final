package edu.jdc.fs.configuracion;

import edu.jdc.fs.clases.Marca;

public class MisConstantes {

    public static Marca[] obtenerMarcas() {

        Marca[] arregloMarcas = new Marca[4];

        arregloMarcas[0] = new Marca(1, "Sa");
        arregloMarcas[1] = new Marca(2, "Ya");
        arregloMarcas[2] = new Marca(3, "Ma");
        arregloMarcas[3] = new Marca(4, "Ra");

        return arregloMarcas;
    }

}
