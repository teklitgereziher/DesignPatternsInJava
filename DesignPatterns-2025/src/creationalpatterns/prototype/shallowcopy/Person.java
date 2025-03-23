package creationalpatterns.prototype.shallowcopy;

public class Person implements Cloneable {
    //Lower-level object
    private Car car;
    private String name;

    public Person(String s, String t) {
        name = s;
        car = new Car(t);
    }

    public Car getCar() {
        return car;
    }

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
