public class Factura {
    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total){
        this.folio= folio;
        this.cliente= cliente;
        this.total= total;

    }

    @Override
    public String toString() {
        return " Factura [folio= " + folio + ", cliente =" + cliente + ", total= $" + total + "]";

    }

    @Override
    public boolean equals(Object obj) {
        // Si las referencias son iguales (fact1 == fact2), nos devuelve true
        if (this == obj) return true;
        // Si el objeto es null o no es una instancia de Factura, nos devuelve false
        if (obj == null || getClass() != obj.getClass()) return false;
        // Compara el folio de ambas facturas
        Factura ambas = (Factura) obj;
        return this.folio.equals(ambas.folio);
    }

    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
