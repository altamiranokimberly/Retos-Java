public class Main {
    public static void main(String[] args) {
        // facturas con el mismo folio
        Factura fact1 = new Factura("CKAC085", "Celina Torres", 1000.00);
        Factura fact2 = new Factura("CKAC085", "Circe Sarah", 1850.00);

        // Con toString() mostramos las facturas
        System.out.println(fact1);
        System.out.println(fact2);

        // Usamos equals() para compararsi son iguales
        System.out.println("¿Las facturas son iguales?: " + fact1.equals(fact2));
    }
}