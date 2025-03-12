package creationalpatterns.builderpattern.builders;

import creationalpatterns.builderpattern.cars.CarType;
import creationalpatterns.builderpattern.components.Engine;
import creationalpatterns.builderpattern.components.GPSNavigator;
import creationalpatterns.builderpattern.components.Transmission;
import creationalpatterns.builderpattern.components.TripComputer;

/**
 * Builder interface defines all possible ways to build a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
