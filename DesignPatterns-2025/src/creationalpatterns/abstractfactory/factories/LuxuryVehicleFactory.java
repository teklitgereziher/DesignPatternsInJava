package creationalpatterns.abstractfactory.factories;

import creationalpatterns.abstractfactory.Car;
import creationalpatterns.abstractfactory.LuxuryCar;
import creationalpatterns.abstractfactory.LuxurySUV;
import creationalpatterns.abstractfactory.SUV;

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
