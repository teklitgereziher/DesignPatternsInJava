package creationalpatterns.factoryethodpattern_p2.factories;

import creationalpatterns.factoryethodpattern_p2.interfaces.Animal;

public abstract class AnimalFactory {
    public void createAndDisplayAnimal(String color) {
        Animal animal;
        animal = createAnimal(color);
        animal.displayBehavior();
    }

    // This is the "factory method" and the instantiation process is deferred to the subclasses.
    public abstract Animal createAnimal(String color);
}
