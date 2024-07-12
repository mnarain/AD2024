package sr.unasat.ad.linear.linked.list;

import sr.unasat.ad.models.Car;

public class doublyLink {
    public Car car;
    public doublyLink next;
    public doublyLink previous;

    public doublyLink(Car car) {
        this.car = car;
    }

    public void display() {
        System.out.print(car);
    }
}
