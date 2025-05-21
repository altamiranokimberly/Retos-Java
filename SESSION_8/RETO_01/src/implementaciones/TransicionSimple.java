package implementaciones;

import interfaces.TransicionHistorias;

public class TransicionSimple implements TransicionHistorias {
    @Override
    public void transicionar(String escenaActual, String nuevaEscena) {
        System.out.println("🔄 Transición de '" + escenaActual + "' a '" + nuevaEscena + "'");
    }
}
