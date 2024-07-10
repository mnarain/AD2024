package sr.unasat.ad.linear.linked.list;

import sr.unasat.ad.models.Car;

public class Link {
    public Car car;
    public Link next;

    public Link(Car car) {
        this.car = car;
    }

    public void display() {
        System.out.print(car);
    }
}
