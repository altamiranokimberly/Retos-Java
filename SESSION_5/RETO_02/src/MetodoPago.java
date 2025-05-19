public abstract class MetodoPago implements Autenticable{
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen() {
        System.out.println("Tipo de pago: " + this.getClass().getSimpleName());
        System.out.println("Monto: $" + monto);
    }


}
