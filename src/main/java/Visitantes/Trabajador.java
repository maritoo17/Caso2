package Visitantes;

public class Trabajador {
    String nombre;
    String puesto;

    public Trabajador(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void vigilar () {
        System.out.println("Trabajador " + nombre + " vigilando el habitat");
    }
}
