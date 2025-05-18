import java.util.Objects;

public class CuentaFiscal {
    private String rfc;
    double saldoDisponible;

    public CuentaFiscal(String rfc, double saldoDisponible){
        this.rfc= rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("Usuario, el saldo no puede ser negativo. Se ha asignado un 0.");
            this.saldoDisponible = 0;
        }
    }

//getters
    public String getRfc() {
        return rfc;
    }
    public double getSaldoDisponible() {
        return saldoDisponible;
    }


    public boolean validarRFC(DeclaracionImpuestos d) {
        return Objects.equals(this.rfc, d.rfcContribuyente());
    }

    public void mostrarCuenta() {
        System.out.println(" Cuenta fiscal registrada con el RFC: " + rfc + ", saldo disponible: $" + saldoDisponible);
    }
}

