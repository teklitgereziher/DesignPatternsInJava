package creationalpatterns.abstractfactory.factories;

import creationalpatterns.abstractfactory.Car;
import creationalpatterns.abstractfactory.NonLuxuryCar;
import creationalpatterns.abstractfactory.NonLuxurySUV;
import creationalpatterns.abstractfactory.SUV;

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
