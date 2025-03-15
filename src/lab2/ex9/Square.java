package lab2.ex9;

public class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double side() {
        return side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
