package Habitats;

import Animales.Animal_aviario;

import java.util.List;

public class Habitat_aviario extends Habitat {
    double altura;
    double ancho;

    List <Animal_aviario> animales;

    public Habitat_aviario(String nombre, double temperatura, double humedad, double limpieza, double altura, double ancho) {
        super(nombre, temperatura, humedad, limpieza);
        this.altura = altura;
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public void monitorear () {
        System.out.println("Habitat " + nombre);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Humedad: " + humedad);
        System.out.println("Limpieza: " + limpieza);
        System.out.println("Altura: " + altura);
        System.out.println("Ancho: " + ancho);
    }
}
