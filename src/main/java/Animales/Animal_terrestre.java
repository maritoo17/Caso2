package Animales;

public class Animal_terrestre extends Animal{

    boolean patas;
    boolean cola;
    boolean pelaje;

    public Animal_terrestre(String nombre, String especie, String color, String edad, String alimentacion, boolean patas, boolean cola, boolean pelaje) {
        super(nombre, especie, color, edad, alimentacion, "Habitat_terrestre");
        this.patas = patas;
        this.cola = cola;
        this.pelaje = pelaje;
    }
    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
}