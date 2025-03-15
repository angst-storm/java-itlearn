package lab2.ex5;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 10.0);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());

        rectangle.setLength(7.0);
        rectangle.setWidth(12.0);

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
