package ed.jdc.vista;

import ed.jdc.modelo.Nodo;
import java.util.List;


public class Vista {
    public void mostrarListaEstudiantes(List<Nodo> estudiantes) {
        System.out.println("Listado de estudiantes:");
        for (Nodo estudiante : estudiantes) {
             System.out.println("Nombre: " + estudiante.getNombre() + ", Edad: "  );
        }
        System.out.println();
    }
}
