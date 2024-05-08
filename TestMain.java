package lab;

public class TestMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        rectangle.printArea();

        Triangle triangle = new Triangle(7, 6);
        triangle.printArea();

        Circle circle = new Circle(5);
        circle.printArea();
    }
}
