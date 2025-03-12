package creationalpatterns.factoryethodpattern_p2.concrete;

import creationalpatterns.factoryethodpattern_p2.interfaces.Animal;

public class Elephant implements Animal{
    public Elephant(String color) {
        System.out.println("A " + color + " Elephant is created.");
    }

    public void displayBehavior() {
        System.out.println("The Elephant is walking.");
        System.out.println("Elephant do not fall a sleep.");
    }
}
