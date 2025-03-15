package lab2.ex6;

public interface IShape {
    double area();

    double perimeter();

    static void main(String[] args) {
        IShape circle = new Circle(5);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        IShape square = new Square(4);
        System.out.println(square.area());
        System.out.println(square.perimeter());

        IShape triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
    }
}
