package creationalpatterns.factoryethodpattern_p2.factories;

import creationalpatterns.factoryethodpattern_p2.concrete.Elephant;
import creationalpatterns.factoryethodpattern_p2.interfaces.Animal;

public class ElephantFactory extends AnimalFactory {
    @Override
    public Animal createAnimal(String color) {
        return new Elephant(color);
    }
}
