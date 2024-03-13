package polygon;

public class PolygonTest {
    public static void main(String[] args) {
        RegularPolygon reg0 = new RegularPolygon();
        RegularPolygon reg1 = new RegularPolygon(6, 4);
        RegularPolygon reg2 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println(reg0);
        System.out.println(reg1);
        System.out.println(reg2);
    }
}
