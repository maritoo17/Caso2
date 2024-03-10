package Habitats;

public class Habitat {
    String nombre;
    double temperatura;
    double humedad;
    double limpieza;

    public Habitat(String nombre, double temperatura, double humedad, double limpieza) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
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
}
