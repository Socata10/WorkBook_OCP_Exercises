package Chapter4_5.Ex8;

public final class Bike extends Transport {
    private final boolean hasCarrier;

    public Bike(String name, boolean hasCarrier) {
        super(name);
        this.hasCarrier = hasCarrier;
    }
    public boolean isHasCarrier() {
        return hasCarrier;
    }

    @Override
    public String move() {
        return "";
    }
}
