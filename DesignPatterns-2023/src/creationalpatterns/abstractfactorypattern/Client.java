package creationalpatterns.abstractfactorypattern;

import creationalpatterns.abstractfactorypattern.dog.Dog;
import creationalpatterns.abstractfactorypattern.factories.AnimalFactory;
import creationalpatterns.abstractfactorypattern.factories.WildAnimalFactory;
import creationalpatterns.abstractfactorypattern.tiger.Tiger;

public class Client {
    public static void main(String args[]) {
        System.out.println("Hi, this is ***Abstract Factory Patter.***\n");
        AnimalFactory animalFactory;

        animalFactory = new WildAnimalFactory();
        Dog dog = animalFactory.createDog("white");
        Tiger tiger = animalFactory.createTiger("golden and cinnamon");
        dog.displayMe();
        tiger.aboutMe();
        tiger.inviteDog(dog);
        System.out.println("\n************\n");
    }
}
