public class Rectangle1 {
    double width;
    double height;
    double area;
    double perimeter;
    public Rectanlge1() {
        this.width = 1;
        this.height = 1;
    }
    public Rectanlge1(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(double height,double width){
        area = height * width;
        return area;
    }
    public double getPerimeter(double width,double height){
        perimeter = 2 * (width + height);
        return perimeter;
    }
    public void displayInfo(){
        getArea();
        getPerimeter();
        System.out.println(height);
        System.out.println(width);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
