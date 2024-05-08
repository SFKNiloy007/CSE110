package interfaze;

import java.util.ArrayList;
import java.util.Collections;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car(2012,"Toyota");
        Car c2 = new Car(2014,"Alpha");
        Car c3 = new Car(2011,"Ferrari");
        Car c4 = new Car(2017,"Nissan");

        ArrayList<Car> arr = new ArrayList<>();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);
        arr.add(c4);

        for (Car c : arr )
        {
            System.out.println(c.getId());
        }
        Collections.sort(arr);
        for (Car c : arr )
        {
            System.out.println(c.getId());
        }
    }
}
