package creationalpatterns.factorymethodpattern.factories;

import creationalpatterns.factorymethodpattern.concrete.Lion;
import creationalpatterns.factorymethodpattern.interfaces.Animal;

// This class is used to create Lion instance.
public class LionFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Lion();
    }
}
