package Animales;

public class Animal_aviario extends Animal {

    boolean vuela;
    boolean pico;
    boolean plumaje;

    public Animal_aviario (String nombre, String especie, String color, String edad, String alimentacion, boolean vuela, boolean pico, boolean plumaje) {
        super(nombre, especie, color, edad, alimentacion, "Habitat_aviario");
        this.vuela = vuela;
        this.pico = pico;
        this.plumaje = plumaje;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isPlumaje() {
        return plumaje;
    }

    public void setPlumaje(boolean plumaje) {
        this.plumaje = plumaje;
    }
}