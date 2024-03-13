package Animales;

public class Animal_acuatico extends Animal {

    boolean aletas;
    boolean branquias;
    boolean escamas;
    String tipo_agua;

    public Animal_acuatico(String nombre, String especie, String color, String edad, String alimentacion, boolean aletas) {
        super(nombre, especie, color, edad, alimentacion, "Habitat_acuatico");
        this.aletas = aletas;
        this.branquias = branquias;
        this.escamas = escamas;
        this.tipo_agua = tipo_agua;
    }

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public boolean isBranquias() {
        return branquias;
    }

    public void setBranquias(boolean branquias) {
        this.branquias = branquias;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public String getTipo_agua() {
        return tipo_agua;
    }

    public void setTipo_agua(String tipo_agua) {
        this.tipo_agua = tipo_agua;
    }
}