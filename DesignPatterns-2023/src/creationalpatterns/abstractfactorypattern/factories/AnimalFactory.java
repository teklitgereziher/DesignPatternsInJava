package creationalpatterns.abstractfactorypattern.factories;

import creationalpatterns.abstractfactorypattern.dog.Dog;
import creationalpatterns.abstractfactorypattern.tiger.Tiger;

public abstract class AnimalFactory {
    public abstract Tiger createTiger(String color);
    public abstract Dog createDog(String color);
}
