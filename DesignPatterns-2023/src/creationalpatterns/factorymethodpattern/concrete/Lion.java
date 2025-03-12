package creationalpatterns.factorymethodpattern.concrete;

import creationalpatterns.factorymethodpattern.interfaces.Animal;

public class Lion implements Animal {
    public Lion() {
        System.out.println("A Lion is created.");
    }

    public void displayBehavior() {
        System.out.println("The lion is roaring.");
        System.out.println("It loves to roar in a jungle.");
    }
}
