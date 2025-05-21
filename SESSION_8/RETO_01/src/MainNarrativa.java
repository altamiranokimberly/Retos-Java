import interfaces.TransicionHistorias;
import interfaces.GestorDialogo;
import interfaces.LogicaDecision;
import implementaciones.TransicionSimple;
import implementaciones.DialogoTexto;
import implementaciones.DecisionBinaria;

public class MainNarrativa {
    public static void main(String[] args) {

        TransicionHistorias transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();


        String escenaActual = "inicio";
        dialogo.mostrarDialogo("Narrador", "Te encuentras en un reino que se encuentra en guerra...");

        String eleccion = decision.tomarDecision();

        if (eleccion.equals("pueblo")) {
            transicion.transicionar(escenaActual, "Pueblo en ruinas");
            dialogo.mostrarDialogo("Caballero", "Has elegido el pueblo... ¡Ten cuidado con los traidores! \n ¿Estás listo para salvar vidas?");
        } else {
            transicion.transicionar(escenaActual, "Castillo Oscuro");
            dialogo.mostrarDialogo("Guardián", "Has entrado al castillo... ¿Estás listo para el desafío? \n un paso en falso y tu rey podría morir");
        }
    }
}
