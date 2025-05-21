import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        double consumo;
        Scanner scanner = null;
        Set<Double> registrosCPU = new HashSet<>();

        try {
            scanner = new Scanner(System.in);
            System.out.println("💻 Monitoreo de consumo de CPU por servidor");
            System.out.println("Ingrese valores en % (escriba 'fin' para terminar):");

            while (true) {
                System.out.print("➡️ Ingresar consumo: ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                try {
                    consumo = Double.parseDouble(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Error: Ingresa un valor numérico válido.");
                    continue;
                }

                if (consumo < 0 || consumo > 100) {
                    System.out.println("⚠️ Error: El consumo debe estar entre 0 y 100%.");
                    continue;
                }

                if (!registrosCPU.add(consumo)) {
                    System.out.println("⚠️ Advertencia: Registro duplicado. Ya se ingresó ese valor.");
                    continue;
                }

                if (consumo > 95) {
                    throw new ConsumoCriticoException("\uD83D\uDEA8 ¡Alerta crítica! Consumo del " + consumo + "% en un servidor.");
                }

                System.out.println("✅ Registro aceptado: " + consumo + "%");
            }

            System.out.println("\n📊 Registros finales de CPU:");
            registrosCPU.forEach(valor -> System.out.println("🖥️ CPU: " + valor + "%"));

        } catch (ConsumoCriticoException ex) {
            System.out.println("🚨 Excepción detectada: " + ex.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("📌 Recurso cerrado correctamente.");
            }
        }
    }
}
