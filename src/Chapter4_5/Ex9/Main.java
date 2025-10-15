package Chapter4_5.Ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 40));
        people.add(new Person("Alice", 25));

        people.forEach(System.out::println);

        System.out.println(people.get(0).equals(people.get(2)));
        System.out.println(people.get(0).hashCode());
    }
}
