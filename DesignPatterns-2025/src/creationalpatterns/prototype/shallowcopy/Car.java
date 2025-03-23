package creationalpatterns.prototype.shallowcopy;

public class Car {
    private String name;

    public Car(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }
}
