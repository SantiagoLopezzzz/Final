package modelo;

import java.util.ArrayList;
import java.util.List;


public class ColaMultas {
     private List<Multa> multas;

    public ColaMultas() {
        multas = new ArrayList<>();
    }

    public void encolar(Multa multa) {
        multas.add(multa);
    }

    public Multa desencolar() {
        if (multas.isEmpty())
            return null;
        return multas.remove(0);
    }

    public List<Multa> getMultas() {
        return multas;
    }
}
