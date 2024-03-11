package Visitantes;

import Habitats.*;
import Animales.*;

public interface Tour {
    void visit(Habitat_acuatico habitat);
    void visit(Habitat_aviario habitat);
    void visit(Habitat_terrestre habitat);
    void visit(Animal_acuatico animal);
    void visit(Animal_aviario animal);
    void visit(Animal_terrestre animal);

}
