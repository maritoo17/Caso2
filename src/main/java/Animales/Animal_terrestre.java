package Animales;

public class Animal_terrestre extends Animal{

    boolean patas;
    boolean cola;
    boolean pelaje;
    String tipo_terrestre;

    public Animal_terrestre(String nombre, String especie, String raza, String color, String sexo, String edad, String peso, String altura, String tipo, String habitat, String alimentacion, String reproduccion, String cuidados, String enfermedades, String vacunas, int id,boolean salud, boolean comportamiento,  boolean patas, boolean cola, boolean pelaje, String tipo_terrestre) {
        super(nombre, especie, raza, color, sexo, edad, peso, altura, tipo, habitat, alimentacion, reproduccion, cuidados, enfermedades, vacunas, comportamiento, salud, id);
        this.patas = patas;
        this.cola = cola;
        this.pelaje = pelaje;
        this.tipo_terrestre = tipo_terrestre;
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

    public String getTipo_terrestre() {
        return tipo_terrestre;
    }

    public void setTipo_terrestre(String tipo_terrestre) {
        this.tipo_terrestre = tipo_terrestre;
    }


}