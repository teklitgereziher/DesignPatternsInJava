package creationalpatterns.abstractfactory.concretefactories;

import creationalpatterns.abstractfactory.abstractproducts.Car;
import creationalpatterns.abstractfactory.abstractproducts.SUV;
import creationalpatterns.abstractfactory.concreteproducts.NonLuxuryCar;
import creationalpatterns.abstractfactory.concreteproducts.NonLuxurySUV;
import creationalpatterns.abstractfactory.factory.VehicleFactory;

/**
 * Responsible for creating instances of classes representing non-luxury vehicles
 */
public class NonLuxuryVehicleFactory extends VehicleFactory {
    @Override
    public Car getCar() {
        return new NonLuxuryCar("NL-C");
    }

    @Override
    public SUV getSUV() {
        return new NonLuxurySUV("NL-S");
    }
}
