public class UnidadBomberos extends UnidadEmergencia{

    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;


    public UnidadBomberos(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder() {
        System.out.println("Atendiendo al llamado, unidad de bomberos en camino para resolver la situacion presentada");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
