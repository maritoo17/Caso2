import java.util.Scanner;

import Animales.*;
import Habitats.*;
import MantenimientoYSeguridad.*;
import Visitantes.*;

public class Zoológico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Eres un visitante o un trabajador?");
        String userType = scanner.nextLine();

        Habitat_acuatico acuatico = new Habitat_acuatico("Acuático", 100.0, 75.0, "true", 50.0, 25.0);
        Habitat_aviario aviario = new Habitat_aviario("Aviario", 200.0, 150.0, "false", 100.0, 75.0);
        Habitat_terrestre terrestre = new Habitat_terrestre("Terrestre", 300.0, 225.0, "true", "Tierra", "Árboles");

        Animal_acuatico tiburon = new Animal_acuatico("Mordisquitos", "Tiburón", "Blanco", "8", "Carnívoro", true);
        Animal_acuatico delfin = new Animal_acuatico("Saltimbanqui", "Delfín", "Azul", "4", "Herbívoro", true);
        Animal_acuatico ballena = new Animal_acuatico("Wally", "Ballena", "Azul", "3", "Herbívoro", true);

        Animal_aviario aguila = new Animal_aviario("Falcao", "Águila", "Blanco y marrón", "7", "Carnívoro", true, true, true);
        Animal_aviario loro = new Animal_aviario("Charlatán", "Loro", "Colorido", "4", "Herbívoro", true, true, true);
        Animal_aviario pinguino = new Animal_aviario("Kanye Nest", "Pingüino", "Blanco y negro", "5", "Carnívoro", false, true, false);

        Animal_terrestre leon = new Animal_terrestre("Simba", "León", "Naranja", "4", "Carnívvoro", true, true, true);
        Animal_terrestre elefante = new Animal_terrestre("Dumbo", "Elefante", "Gris", "6", "Herbívoro", true, true, false);
        Animal_terrestre jirafa = new Animal_terrestre("Cuellilargo", "Jirafa", "Amarillo", "7", "Herbívoro", true, true, false);


        if (userType.equalsIgnoreCase("Trabajador")) {
            System.out.println("Eres un trabajador. ¿Qué tarea quieres realizar? (Vigilar/Seguimiento)");
            String tarea = scanner.nextLine();

            if (tarea.equalsIgnoreCase("Vigilar")) {
                System.out.println("¿Qué hábitat quieres vigilar? (Acuático/Aviario/Terrestre)");
                String habitatChoice = scanner.nextLine();

                Habitat habitatSeleccionado;
                switch (habitatChoice.toLowerCase()) {
                    case "acuático":
                        habitatSeleccionado = acuatico;
                        break;
                    case "aviario":
                        habitatSeleccionado = aviario;
                        break;
                    case "terrestre":
                        habitatSeleccionado = terrestre;
                        break;
                    default:
                        System.out.println("No se reconoce el hábitat seleccionado.");
                        return;
                }

                System.out.println("Estás vigilando el hábitat: " + habitatSeleccionado.getId());

                Seguridad vigilante = new Seguridad("Pedro", 30, habitatSeleccionado);
                vigilante.vigilarHabitat();

            } else if (tarea.equalsIgnoreCase("Seguimiento")) {
                System.out.println("¿Qué hábitat quieres seleccionar para el seguimiento? (Acuático/Aviario/Terrestre)");
                String habitatChoice = scanner.nextLine();

                Habitat habitatSeleccionado;
                switch (habitatChoice.toLowerCase()) {
                    case "acuático":
                        habitatSeleccionado = acuatico;
                        break;
                    case "aviario":
                        habitatSeleccionado = aviario;
                        break;
                    case "terrestre":
                        habitatSeleccionado = terrestre;
                        break;
                    default:
                        System.out.println("No se reconoce el hábitat seleccionado.");
                        return;
                }

                System.out.println("¿Qué animal quieres seleccionar para el seguimiento?");
                for (int i = 0; i < habitatSeleccionado.getAnimales().size(); i++) {
                    System.out.println((i + 1) + ". " + habitatSeleccionado.getAnimales().get(i).getClass());
                }
                int animalChoice = scanner.nextInt();
                scanner.nextLine();

                if (animalChoice < 1 || animalChoice > habitatSeleccionado.getAnimales().size()) {
                    System.out.println("No se reconoce el animal seleccionado.");
                    return;
                }

                Mantenimiento seguimiento = new Mantenimiento("Pedro", habitatSeleccionado.getAnimales().get(animalChoice - 1), habitatSeleccionado);
                seguimiento.hacerMantenimiento();
            } else {
                System.out.println("No se reconoce la tarea seleccionada.");
            }
        } else if (userType.equalsIgnoreCase("Visitante")) {
            System.out.println("Eres un visitante. ¿Qué hábitat quieres visitar? (Acuático/Aviario/Terrestre)");
            String habitatChoice = scanner.nextLine();

            Habitat habitatSeleccionado;
            switch (habitatChoice.toLowerCase()) {
                case "acuático":
                    habitatSeleccionado = acuatico;
                    break;
                case "aviario":
                    habitatSeleccionado = aviario;
                    break;
                case "terrestre":
                    habitatSeleccionado = terrestre;
                    break;
                default:
                    System.out.println("No se reconoce el hábitat seleccionado.");
                    return;
            }

            habitatSeleccionado.mostrarAnimales();
            System.out.println("¿Qué animal quieres visitar? (1/2/3)");
            int animalChoice = scanner.nextInt();
            scanner.nextLine();

            if (animalChoice < 1 || animalChoice > habitatSeleccionado.getAnimales().size()) {
                System.out.println("No se reconoce el animal seleccionado.");
                return;
            }

            Animal animalSeleccionado = (Animal) habitatSeleccionado.getAnimales().get(animalChoice - 1);
            Visitante visitante = new Visitante("Juan", 25);
            visitante.visitarAnimal(animalSeleccionado);
        } else {
            System.out.println("No se reconoce el tipo de usuario seleccionado.");
        }
    }
}