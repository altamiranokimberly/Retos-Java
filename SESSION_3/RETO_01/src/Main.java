public class Main {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("Kim Altamirano", "T4U3085");

        // Crear un vuelo con código, destino y hora de salida
        Vuelo vuelo = new Vuelo("CK855", "Tailandia", "11:11");

        // Reservar asiento para el pasajero
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("✅ Reserva realizada con éxito.\n");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n");
        }

        // Mostrar el itinerario del vuelo
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar la reserva
        System.out.println("❌ Cancelando reserva...\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario después de la cancelación
        System.out.println(vuelo.obtenerItinerario());

        // Reservar nuevamente con otro pasajero usando sobrecarga
        vuelo.reservarAsiento("Felix Bang", "F581155");

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());
    }
}
