package creationalpatterns.abstractfactory.concretefactories;

import creationalpatterns.abstractfactory.abstractproducts.Car;
import creationalpatterns.abstractfactory.abstractproducts.SUV;
import creationalpatterns.abstractfactory.concreteproducts.LuxuryCar;
import creationalpatterns.abstractfactory.concreteproducts.LuxurySUV;
import creationalpatterns.abstractfactory.factory.VehicleFactory;

/**
 * Responsible for creating instances of classes representing luxury vehicles
 */
public class LuxuryVehicleFactory extends VehicleFactory {
    @Override
    public Car getCar() {
        return new LuxuryCar("L-C");
    }

    @Override
    public SUV getSUV() {
        return new LuxurySUV("L-S");
    }
}
