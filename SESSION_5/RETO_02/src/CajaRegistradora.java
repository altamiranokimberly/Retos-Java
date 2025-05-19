public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = new MetodoPago[] {
                new PagoEfectivo(150),
                new PagoTarjeta(450, 700),
                new PagoTarjeta(1800, 1400), // No debe pasar autenticación
                new PagoTransferencia(3000, true),
                new PagoTransferencia(2000, false) // Fallo bancario simulado
        };

        for (MetodoPago pago : pagos) {
            System.out.println("<<<<<<<<< Procesando método de pago >>>>>>>>>>>");

            // Usamos casting para poder llamar a autenticar()
            if (pago.autenticar()) {
                System.out.println(" Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            }else {
                System.out.println(" Autenticación fallida. Pago no procesado."  + pago.getClass().getSimpleName() + " no válido.");
            }

            System.out.println();
        }
    }
}
