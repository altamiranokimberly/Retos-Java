import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

// Clase Tema que implementa Comparable para ordenar por título
class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo); // Orden alfabético
    }

    @Override
    public String toString() {
        return "📚 Tema: " + titulo + " | Prioridad: " + prioridad;
    }
}

public class TemarioColaborativo {
    public static void main(String[] args) {

        // Lista concurrente de temas activos
        CopyOnWriteArrayList<Tema> temasActivos = new CopyOnWriteArrayList<>();

        // Agregamos temas
        temasActivos.add(new Tema("Inteligencia Artificial", 1));
        temasActivos.add(new Tema("Aprendizaje de Java y Spring", 1));
        temasActivos.add(new Tema("Evaluación Formativa", 3));
        temasActivos.add(new Tema("Aprendizaje Basado en Proyectos", 3));
        temasActivos.add(new Tema("Neuroeducación", 2));

        // Ordenar por título
        Collections.sort(temasActivos);
        System.out.println(" Temas ordenados alfabéticamente:");
        for (Tema tema : temasActivos) {
            System.out.println(tema);
        }

        // Ordenar por prioridad ascendente (usando Comparator)
        temasActivos.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\n Temas ordenados por prioridad (1 → 3):");
        for (Tema tema : temasActivos) {
            System.out.println(tema);
        }

        // Repositorio concurrente de recursos
        ConcurrentHashMap<String, String> recursosCompartidos = new ConcurrentHashMap<>();
        recursosCompartidos.put("Inteligencia Artificial", "https://www.relataly.com/");
        recursosCompartidos.put("Aprendizaje de Java y Spring", "https://www.aprendiendojava.info/recursos");
        recursosCompartidos.put("Evaluación Formativa", "Guía PDF: Evaluación Continua");
        recursosCompartidos.put("Aprendizaje Basado en Proyectos", "https://www.escuelaenlanube.com/aprendizaje-basado-en-proyectos/");
        recursosCompartidos.put("Neuroeducación", "Video: Cómo aprende el cerebro");


        System.out.println("\n📂 Repositorio de recursos compartidos por tema:");
        for (String titulo : recursosCompartidos.keySet()) {
            System.out.println(titulo + " → " + recursosCompartidos.get(titulo));
        }
    }
}
