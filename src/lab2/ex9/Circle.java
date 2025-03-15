package lab2.ex9;

public class Circle extends Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double radius() {
        return r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
