public class Main {
    public static void main(String[] args) {
        boolean rfcValido;

        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("CKAC855801555", 15850.00);
        CuentaFiscal cuenta = new CuentaFiscal("CKAC855801555", 19500.0);
        System.out.println("Declaración enviada por RFC: " + declaracion.rfcContribuyente() + " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        rfcValido = cuenta.validarRFC(declaracion);
        System.out.println(" ¿RFC valido para esta cuenta?: " + rfcValido);
    }

}
