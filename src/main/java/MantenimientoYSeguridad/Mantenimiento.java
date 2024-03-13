package MantenimientoYSeguridad;

import Habitats.Habitat;
import Visitantes.Trabajador;
import Animales.Animal;

public class Mantenimiento {
    private String nombre;
    private Animal animal;
    private Habitat habitat;

    public Mantenimiento(String nombre, Animal animal, Habitat habitat) {
        this.nombre = nombre;
        this.animal = animal;
        this.habitat = habitat;
    }

    public Mantenimiento(String pedro, Object o, Habitat habitatSeleccionado) {
    }
    
    public void hacerMantenimiento () {
        System.out.println("El trabajador " + nombre + " está realizando el seguimiento del animal " + animal.getNombre() + " en el hábitat " + habitat.getId() + ".");
    }
}
