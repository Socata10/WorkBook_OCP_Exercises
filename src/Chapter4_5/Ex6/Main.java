package Chapter4_5.Ex6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 4, 5));
        for (Shape shape : shapes) {
            System.out.printf("Area: %.2f%n", shape.area());
            System.out.printf("Perimeter: %.2f%n", shape.perimeter());
        }
    }
}
