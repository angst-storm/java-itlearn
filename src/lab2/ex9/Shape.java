package lab2.ex9;

import java.util.Arrays;

public abstract class Shape {
    abstract double area();

    abstract double perimeter();

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle.radius());

        Square square = new Square(4);
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println(square.side());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
        System.out.println(Arrays.toString(triangle.sides()));
    }
}
