package Habitats;

import Animales.Animal_terrestre;

import java.util.List;

public class Habitat_terrestre extends Habitat {
    String tipo_suelo;
    String vegetación;

    List <Animal_terrestre> animales;

    public Habitat_terrestre(String nombre, double temperatura, double humedad, String limpieza, String tipo_suelo, String vegetación) {
        super(nombre, temperatura, humedad, limpieza);
        this.tipo_suelo = tipo_suelo;
        this.vegetación = vegetación;
    }

    public String getTipo_suelo() {
        return tipo_suelo;
    }

    public void setTipo_suelo(String tipo_suelo) {
        this.tipo_suelo = tipo_suelo;
    }

    public String getVegetación() {
        return vegetación;
    }

    public void setVegetación(String vegetación) {
        this.vegetación = vegetación;
    }

    public void monitorear() {
        System.out.println("Habitat " + nombre);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + limpieza);
        System.out.println("Tipo de suelo: " + tipo_suelo);
        System.out.println("Vegetación: " + vegetación);
    }
}
