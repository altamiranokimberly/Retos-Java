public class Operador {
    String nombre;

    public Operador(String nombre){
        this.nombre= nombre;
    }
    public void reportarse(){
        System.out.println(" El operador " + nombre + " reportándose");
    }
}
