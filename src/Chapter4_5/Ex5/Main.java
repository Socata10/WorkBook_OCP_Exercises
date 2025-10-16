package Chapter4_5.Ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Bird());
        animals.add(new Mammal());
        animals.add(new Eagle());
        animals.add(new Dog());
        for (Animal animal: animals) {
            if (animal instanceof Mammal){
                System.out.println("This is a mammal.");
            } else if (animal instanceof Bird) {
                System.out.println("This is a bird.");
            }
            animal.makeSound();
        }
    }
}

