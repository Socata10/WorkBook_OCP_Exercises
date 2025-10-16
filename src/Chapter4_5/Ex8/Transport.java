package Chapter4_5.Ex8;

public sealed abstract class Transport permits Car, Bike, Bus  {
    private final String brand;

    public Transport(String name) {
        this.brand = name;
    }

    public String getBrand() {
        return brand;
    }

    public abstract String move();
}
