public class Main {
    public static void main(String[] args) {
        // Crear varias facturas con y sin RFC
        Factura factura1 = new Factura(3499.99, "Diseño de página web", "ALTZ920101QX1");
        Factura factura2 = new Factura(1200.50, "Mantenimiento eléctrico", null);
        Factura factura3 = new Factura(8750.00, "Instalación de cámaras de seguridad", "CAMG850512RP3");
        Factura factura4 = new Factura(599.90, "Suscripción a software de seguridad", null);
        Factura factura5 = new Factura(22000.00, "Proyecto de automatización IA ", "INDT010203A00");

        // Mostramos todas las facturas
        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());
        System.out.println(factura3.getResumen());
        System.out.println(factura4.getResumen());
        System.out.println(factura5.getResumen());
    }
}
