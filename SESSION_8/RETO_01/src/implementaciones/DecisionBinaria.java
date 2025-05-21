package implementaciones;

import interfaces.LogicaDecision;

import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String tomarDecision() {
        System.out.println("🤔 Elige una opción:");
        System.out.println("1. Ir al pueblo a proteger a los ciudadanos");
        System.out.println("2. Entrar al castillo a proteger al rey");
        String opcion = scanner.nextLine();
        if (opcion.equals("1")) {
            return "pueblo";
        } else {
            return "castillo";
        }
    }
}
