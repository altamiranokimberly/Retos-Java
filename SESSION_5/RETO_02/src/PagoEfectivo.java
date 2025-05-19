public class PagoEfectivo extends MetodoPago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {// No se requiere autenticación para pago en efectivo
        return true;
    }

    @Override
    public void procesarPago() {
        System.out.println("El pago en efectivo de $" + monto + "h a sido procesado correctamente.");
    }
}
