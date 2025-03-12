package creationalpatterns.factorymethodpattern;

import creationalpatterns.factorymethodpattern.factories.AnimalFactory;
import creationalpatterns.factorymethodpattern.factories.ElephantFactory;
import creationalpatterns.factorymethodpattern.factories.LionFactory;
import creationalpatterns.factorymethodpattern.interfaces.Animal;

public class Client {
    public static void main(String[] args) {
        
        System.out.println("Hello, this is ***Factory Method Pattern***");
        AnimalFactory factory;
        Animal animal;
         
        // Create a Lion
        factory = new LionFactory();
        animal = factory.createAnimal();
        animal.displayBehavior();
         
        // Create an Elephant
        factory = new ElephantFactory();
        animal = factory.createAnimal();
        animal.displayBehavior();
        
    }
}
