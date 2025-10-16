package Chapter4_5.Ex8;

public final class Car extends Transport {
    private final int doors;
    public Car(String name, int doors) {
        super(name);
        this.doors = doors;
    }
    public int getDoors() {
        return doors;
    }

    @Override
    public String move() {
        return "The car " + getBrand() + " drives on the road with " + doors + " doors.";
    }
}
