package creationalpatterns.factorymethodpattern.concrete;

import creationalpatterns.factorymethodpattern.interfaces.Animal;

public class Elephant implements Animal {
    public Elephant() {
        System.out.println("An Elephant is created.");
    }

    public void displayBehavior() {
        System.out.println("The Elephant is walking.");
        System.out.println("Elephant do not fall a sleep.");
    }
}
