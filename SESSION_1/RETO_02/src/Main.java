public class Main {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("1er concierto SKZ ", 3800.00);
        Entrada entrada2 = new Entrada("Pelicula de Spiderman", 75.00);
        Entrada entrada3 = new Entrada("Carrera de caballos", 700.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();
        entrada3.mostrarInformacion();

        //Extra o desafio adicional
        Entrada_Record entrada4= new Entrada_Record("Obra de teatro del Mago de OZ", 1000.00);
        entrada4.mostrarInformacion();
    }
}