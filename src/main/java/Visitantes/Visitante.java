package Visitantes;

public class Visitante {
    String nombre;

    public Visitante(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void visitarHabitat() {
        System.out.println("Visitante " + nombre + " visitando el habitat");
    }
}
