package creationalpatterns.abstractfactory.concreteproducts;

import creationalpatterns.abstractfactory.abstractproducts.SUV;

public class LuxurySUV implements SUV {
    private String name;

    public LuxurySUV(String name) {
        this.name = name;
    }

    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "Luxury SUV Features";
    }
}
