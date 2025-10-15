package Chapter4_5.Ex6;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private double radius;

    @Override
    double area() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    double perimeter() {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be > 0");
        this.radius = radius;
    }
    public Circle() {

    }
}
