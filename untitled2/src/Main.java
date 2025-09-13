abstract class Shape {
public abstract double area();
}
class Circle extends Shape {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private final double width, height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        return width * height;
    }
}
class Square extends Shape {
    private final double side;
    public Square(double side) { this.side = side; }
    @Override
    public double area() { return side * side; }
}
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5, 5);
        Shape square = new Square(5);

        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of rectangle: " + rectangle.area());
        System.out.println("Area of square: " + square.area());
    }
}


