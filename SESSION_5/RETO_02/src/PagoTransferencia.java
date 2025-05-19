public class PagoTransferencia extends MetodoPago {
    private boolean bancoDisponible;

    public PagoTransferencia(double monto, boolean bancoDisponible) {
        super(monto);
        this.bancoDisponible = bancoDisponible;
    }

    @Override
    public boolean autenticar() {
        return bancoDisponible;
    }

    @Override
    public void procesarPago() {
        System.out.println("Transferencia bancaria de $" + monto + " procesada exitosamente.");
    }
}
