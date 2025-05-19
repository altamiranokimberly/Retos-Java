public class CentralEmergencias {
    public static void main(String[] args) {

        Ambulancia ambulancia = new Ambulancia("AmbulanciaMX ", "Alexa");
        Patrulla patrulla = new Patrulla("PatrullaMX ", "Alonso");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberosMX ", "Antonio");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();

    }

}