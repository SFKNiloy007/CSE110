public class Rectangle {
    double area;
    double width;
    double height;
    double perimeter;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea(){
        area = height * width;
        return area;
    }
    public Rectangle() {
         this.width = 1;
         this.height = 1;
    }
    double getPerimeter(){
        perimeter = 2 * (width + height);
        return perimeter;
    }
    void displayInfo(){
        getArea();
        getPerimeter();
        System.out.println( "Width is " + width);
        System.out.println("Height is " + height);
        System.out.println("Area is " + area);
        System.out.println("Perimeter is  " + perimeter);
    }
}
