public class Rectengle extends GeometricObject{
    private double width;
    private double height;
    public Rectengle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectengle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectengle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public void printRectangle(){
        System.out.println("Area is " + getArea());
        System.out.println("Perimeter is " + getPerimeter());
    }
}
