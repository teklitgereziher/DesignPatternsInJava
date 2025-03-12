package creationalpatterns.factoryethodpattern_p2.concrete;

import creationalpatterns.factoryethodpattern_p2.interfaces.Animal;

public class Lion implements Animal {
    public Lion(String color) {
        System.out.println("A " + color + " Lion is created.");
    }

    public void displayBehavior() {
        System.out.println("The lion is roaring.");
        System.out.println("It loves to roar in a jungle.");
    }
}
