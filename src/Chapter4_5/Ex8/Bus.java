package Chapter4_5.Ex8;

public final class Bus extends Transport {
    private final int capacity;

    public Bus(String brand, int capacity) {
        super(brand);
        this.capacity = capacity;
    }

    @Override
    public String move() {
        return "The bus " + getBrand() + " carries " + capacity + " passengers.";
    }

}
