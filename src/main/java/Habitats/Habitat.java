package Habitats;

import Animales.Animal;
import java.util.Map;
import java.util.HashMap;

public class Habitat {
    String nombre;
    double temperatura;
    double humedad;
    String limpieza;
    Map<String, Animal> animales = new HashMap<>();


    public Habitat(String nombre, double temperatura, double humedad, String limpieza) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.animales = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public void monitorear() {
        System.out.println("Habitat " + nombre);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + limpieza);
    }

    public Map<String, Animal> getAnimales() {
        return animales;
    }

    public String getId() {
        return nombre;
    }

    public void mostrarAnimales() {
        if (animales.isEmpty()) {
            System.out.println("No hay animales en este hábitat.");
        } else {
            System.out.println("Animales en este hábitat:");
            for (String nombreAnimal : animales.keySet()) {
                System.out.println(nombreAnimal);
            }
        }
    }
}
