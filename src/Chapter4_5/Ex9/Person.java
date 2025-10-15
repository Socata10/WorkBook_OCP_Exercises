package Chapter4_5.Ex9;

public record Person(
        String name,
        int age
) {
    public Person{
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}
