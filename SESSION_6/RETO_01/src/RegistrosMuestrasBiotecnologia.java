import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class RegistrosMuestrasBiotecnologia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //  Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> ordenLlegadaMuestras = new ArrayList<>();
        ordenLlegadaMuestras.add("Homo sapiens");
        ordenLlegadaMuestras.add("Mus musculus");
        ordenLlegadaMuestras.add("Arabidopsis thaliana");
        ordenLlegadaMuestras.add("Homo sapiens");


        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(ordenLlegadaMuestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador

        HashMap<String, String> muestraInvestigador = new HashMap<>();
        muestraInvestigador.put("M-001", "Dra. Cruz");
        muestraInvestigador.put("M-002", "Dr. Chamé");
        muestraInvestigador.put("M-003", "Mtra. Goméz");
        muestraInvestigador.put("M-004", "Dra. Meza");
        muestraInvestigador.put("M-005", "Dra. Altamirano");


        System.out.println(" ⏱\uFE0F Orden de llegada de muestras genéticas:");
        for (String especie : ordenLlegadaMuestras) {
            System.out.println(especie);
        }

        // Paso 4: Mostrar resultados
        System.out.println("\n \uD83D\uDD2C Especies únicas procesadas en el laboratorio:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }


        System.out.println("\n \uD83E\uDDD1\u200D\uD83D\uDD2C Relación de ID de muestra con investigador responsable:");
        for (String id : muestraInvestigador.keySet()) {
            System.out.println(id + " → " + muestraInvestigador.get(id));
        }

        //Una búsqueda por ID de muestra ("M-002" por ejemplo).

        System.out.print("\n🔍 Ingresa el ID de muestra para consultar el investigador (ejemplo: M-002): ");
        String idBuscado = scanner.nextLine();


        if (muestraInvestigador.containsKey(idBuscado)) {
            System.out.println("🧪 Investigador responsable: " + muestraInvestigador.get(idBuscado));
        } else {
            System.out.println("⚠️ ID no encontrado. Verifica el ID ingresado");
        }

        scanner.close();
    }
}
