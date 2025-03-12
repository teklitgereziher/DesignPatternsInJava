package creationalpatterns.factorymethodpattern.factories;

import creationalpatterns.factorymethodpattern.interfaces.Animal;

public abstract class AnimalFactory {
    // This is the "factory method" and the instantiation process is deferred to the subclasses.
    public abstract Animal createAnimal();
}
