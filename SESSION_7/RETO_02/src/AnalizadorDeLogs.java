import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("src/errores.log");

        // Si el archivo no existe, lo creamos con contenido simulado
        if (!Files.exists(rutaArchivo)) {
            try {
                Files.createFile(rutaArchivo);
                BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo.toFile()));
                writer.write("INFO: Inicio de pruebas automatizadas\n");
                writer.write("ERROR: Fallo en el módulo de autenticación\n");
                writer.write("WARNING: Tiempo de respuesta alto en API\n");
                writer.write("SUCCESS: Prueba de login exitosa\n");
                writer.write("ERROR: Error de conexión con base de datos\n");
                writer.write("INFO: Fin de ejecución\n");
                writer.close();
                System.out.println("✅ Se creó un archivo de logs simulado: errores.log");
            } catch (IOException e) {
                System.err.println("❌ No se pudo crear el archivo errores.log: " + e.getMessage());
                registrarFallo(e.getMessage());
                return;
            }
        }

        // Ahora sí, proceder con el análisis del archivo
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo.toFile()))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            System.out.println("\n📋 Resumen del análisis de logs:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores (ERROR): " + errores);
            System.out.println("Cantidad de advertencias (WARNING): " + advertencias);

            if (totalLineas > 0) {
                double porcentaje = ((double)(errores + advertencias) / totalLineas) * 100;
                DecimalFormat df = new DecimalFormat("#.##");
                System.out.println("📊 Porcentaje de líneas con errores o advertencias: " + df.format(porcentaje) + "%");
            }

        } catch (IOException e) {
            System.err.println("⚠️ Error al leer el archivo: " + e.getMessage());
            registrarFallo(e.getMessage());
        }
    }

    private static void registrarFallo(String mensaje) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("src/registro_fallos.txt", true))) {
            escritor.write("❌ [" + java.time.LocalDateTime.now() + "] " + mensaje);
            escritor.newLine();
        } catch (IOException ex) {
            System.err.println("❌ No se pudo guardar el error en registro_fallos.txt: " + ex.getMessage());
        }
    }
}
