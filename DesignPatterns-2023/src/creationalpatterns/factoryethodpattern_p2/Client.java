package creationalpatterns.factoryethodpattern_p2;

import creationalpatterns.factoryethodpattern_p2.factories.AnimalFactory;
import creationalpatterns.factoryethodpattern_p2.factories.ElephantFactory;
import creationalpatterns.factoryethodpattern_p2.factories.LionFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello, this is ***Factory Method Pattern*** extended example.");
        AnimalFactory factory;

        factory = new LionFactory();
        factory.createAndDisplayAnimal("yellow");

        factory = new ElephantFactory();
        factory.createAndDisplayAnimal("white");
    }
}
