public abstract  class UnidadEmergencia {

    String nombre;

    public UnidadEmergencia(String nombre){
        this.nombre= nombre;
    }
    public abstract void responder();

    public void activarUnidad(){
        System.out.println(" Se está activando la unidad " + nombre + "de Emergencia ");
    }

}
