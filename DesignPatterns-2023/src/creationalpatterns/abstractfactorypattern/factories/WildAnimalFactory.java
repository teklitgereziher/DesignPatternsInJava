package creationalpatterns.abstractfactorypattern.factories;

import creationalpatterns.abstractfactorypattern.dog.Dog;
import creationalpatterns.abstractfactorypattern.dog.WildDog;
import creationalpatterns.abstractfactorypattern.tiger.Tiger;
import creationalpatterns.abstractfactorypattern.tiger.WildTiger;

public class WildAnimalFactory extends AnimalFactory {

    public WildAnimalFactory() {
        System.out.println("You opt for a wild animal factory.\n");
    }

    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }

    @Override
    public Dog createDog(String color) {
        return new WildDog(color);
    }
}
