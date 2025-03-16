package creationalpatterns.abstractfactory.client;

import creationalpatterns.abstractfactory.Car;
import creationalpatterns.abstractfactory.SUV;
import creationalpatterns.abstractfactory.factories.VehicleFactory;

public class AutoSearch {
    public static void main(String[] args) {
        String searchResult = null;
        VehicleFactory vf =
                VehicleFactory.getVehicleFactory(VehicleFactory.NON_LUXURY_VEHICLE);
        VehicleType type = VehicleType.SUV;

        if (type == VehicleType.CAR) {
            Car c = vf.getCar();
            searchResult = "Name: " + c.getCarName() + " Features: " + c.getCarFeatures();
        } else if (type == VehicleType.SUV) {
            SUV s = vf.getSUV();
            searchResult = "Name: " + s.getSUVName() + " Features: " + s.getSUVFeatures();
        }

        System.out.println(searchResult);
    }
}
