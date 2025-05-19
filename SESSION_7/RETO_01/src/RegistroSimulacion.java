import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        try {
            //Definir la ruta de la carpeta y del archivo
            Path carpetaConfig = Paths.get("src/RETO_01/Config");
            Path archivoParametros = carpetaConfig.resolve("parametros.txt");

            // Crear la carpeta "config" si no existe
            if (!Files.exists(carpetaConfig)) {
                Files.createDirectories(carpetaConfig);
                System.out.println("📁 Carpeta 'config' creada correctamente.");
            }

            // Contenido del archivo de parámetros
            String contenido = " Tiempo de ciclo: 55.8 segundos \n  Velocidad de línea: 1.2 m/s \n Número de estaciones: 8 ";

            //  Escribir el archivo
            Files.write(archivoParametros, contenido.getBytes());
            System.out.println("✅ Archivo de parámetros creado: " + archivoParametros);

            // Validar si el archivo fue creado correctamente
            if (Files.exists(archivoParametros)) {
                System.out.println("📄 El archivo 'parametros.txt' existe.");

                // Leer y mostrar el contenido
                String contenidoLeido = Files.readString(archivoParametros);
                System.out.println("\n📋 Contenido del archivo:");
                System.out.println(contenidoLeido);
            } else {
                System.out.println("❌ El archivo no se creó correctamente.");

            }

        } catch (IOException e) {
            System.err.println("⚠️ Error al trabajar con archivos: " + e.getMessage());
        }
    }
}
