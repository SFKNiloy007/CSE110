package interfaze;

public class Car implements Comparable<Car>{
    private int id;
    private String name;

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Car o) {
        if(this.getId() == o.getId()) return 0;
        else if(this.getId() > o.getId()) return 1;
        else return -1;
    }
}
