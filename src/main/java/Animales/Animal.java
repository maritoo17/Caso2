package Animales;

    public class Animal {

        private String nombre;
        private String especie;
        private String color;
        private String edad;
        private String alimentacion;
        private String habitat;

        public Animal(String nombre, String especie, String color, String edad, String alimentacion, String habitat) {
            this.nombre = nombre;
            this.especie = especie;
            this.color = color;
            this.edad = edad;
            this.alimentacion = alimentacion;
            this.habitat = habitat;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

        public String getHabitat() {
            return habitat;
        }

        public String getEspecie() {
            return especie;
        }

        public void setEspecie(String especie) {
            this.especie = especie;
        }
    }