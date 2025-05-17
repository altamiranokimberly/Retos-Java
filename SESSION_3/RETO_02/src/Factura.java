import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc; // Uso de Optional para manejar casos donde el RFC puede no estar

    // Constructor de la clase Factura
    // Si el RFC es null, se encapsula como un Optional vacío
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen() {
        String resumen = "🧾 Factura generada:\n";
        resumen += "🔸 Descripción: " + descripcion + "\n";
        resumen += "🔸 Monto: $" + monto + "\n";

        // Si el RFC existe, se muestra; si no, se indica que no fue proporcionado
        resumen += "🔸 RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
