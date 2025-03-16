package creationalpatterns.abstractfactory;

public class LuxuryCar implements Car {
    private String name;

    public LuxuryCar(String name) {
        this.name = name;
    }

    @Override
    public String getCarName() {
        return name;
    }

    @Override
    public String getCarFeatures() {
        return "Luxury Car Features";
    }
}
