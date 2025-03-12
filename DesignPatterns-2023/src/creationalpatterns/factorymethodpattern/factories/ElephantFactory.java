package creationalpatterns.factorymethodpattern.factories;

import creationalpatterns.factorymethodpattern.concrete.Elephant;
import creationalpatterns.factorymethodpattern.interfaces.Animal;

public class ElephantFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Elephant();
    }
}
