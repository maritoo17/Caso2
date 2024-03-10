package Habitats;

public class Habitat_acuatico extends Habitat {
    double salinidad;
    double profundidad;

    public Habitat_acuatico (String nombre, double temperatura, double humedad, double limpieza, double salinidad, double profundidad) {
        super(nombre, temperatura, humedad, limpieza);
        this.salinidad = salinidad;
        this.profundidad = profundidad;
    }

    public double getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public void monitorear() {
        System.out.println("Habitat " + nombre);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + limpieza);
        System.out.println("Salinidad: " + salinidad);
        System.out.println("Profundidad: " + profundidad);
    }
}
