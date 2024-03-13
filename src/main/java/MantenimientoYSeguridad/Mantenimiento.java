package MantenimientoYSeguridad;

import Habitats.Habitat;
import Visitantes.Trabajador;

public class Mantenimiento {
    private Trabajador trabajador;

    public Mantenimiento(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public Mantenimiento(String pedro, Object o, Habitat habitatSeleccionado) {
    }

    public void imprimirDatos (String habitat, String animal) {
        System.out.println ("Trabajador: " + trabajador.getNombre());
        System.out.println ("Puesto: " + trabajador.getPuesto());
        System.out.println ("Habitat: " + habitat);
        System.out.println ("Animal: " + animal);
    }
    
    public void hacerMantenimiento () {
        System.out.println("Trabajador " + trabajador.getNombre() + " realizando mantenimiento");
    }
}
