public class TestGeometricObject {
    public static void main(String[] args) {
        Rectengle rectangle = new Rectengle("Red",true,2,4);
        Circle circle = new Circle("Blue",false,2);

        System.out.println("A Circle ----" + circle.toString());
        circle.printCircle();
        System.out.println("A Rectangle ----" + rectangle.toString());
        rectangle.printRectangle();
    }
}
