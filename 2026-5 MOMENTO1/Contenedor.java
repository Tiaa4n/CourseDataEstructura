public class Contenedor extends Entidad {

    private double peso;
    private String origen;

    public Contenedor(String nombre, String origen, double peso) {
        super(nombre);
        this.origen = origen;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public String getOrigen() {
        return origen;
    }
}