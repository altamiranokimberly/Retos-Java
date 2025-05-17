import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);

        System.out.println("Ingresa el nombre del paciente:");
        String nombre = datos.nextLine();
        System.out.println("Ingresa la edad del paciente:");
        int edad = datos.nextInt();
        datos.nextLine(); //nos sirve para limpiar buffer
        System.out.println("Ingresa el numero de expediente del paciente:");
        String numExp= datos.nextLine();
        datos.close();

        Paciente paciente1 = new Paciente();
        paciente1.nombre= nombre;
        paciente1.edad= edad;
        paciente1.numExp= numExp;

        paciente1.mostrarInformacion();
    }

}