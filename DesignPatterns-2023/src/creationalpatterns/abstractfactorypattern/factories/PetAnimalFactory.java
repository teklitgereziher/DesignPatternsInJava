package creationalpatterns.abstractfactorypattern.factories;

import creationalpatterns.abstractfactorypattern.dog.Dog;
import creationalpatterns.abstractfactorypattern.dog.PetDog;
import creationalpatterns.abstractfactorypattern.tiger.PetTiger;
import creationalpatterns.abstractfactorypattern.tiger.Tiger;

public class PetAnimalFactory extends AnimalFactory {
    public PetAnimalFactory() {
        System.out.println("You opt for a pet animal factory.\n");
    }

    @Override
    public Tiger createTiger(String color) {
        return new PetTiger(color);
    }

    @Override
    public Dog createDog(String color) {
        return new PetDog(color);
    }
}
