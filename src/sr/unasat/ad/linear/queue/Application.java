package sr.unasat.ad.linear.queue;

import sr.unasat.ad.models.Car;

public class Application {

    public static void main(String[] args) {
        CarPriorityQueue cp = new CarPriorityQueue(5);
        cp.insert(new Car(4, "Toyota"));
        cp.insert(new Car(2, "Honda"));
        cp.insert(new Car(1, "BMW"));
        cp.insert(new Car(5, "Audi"));
        cp.insert(new Car(3, "Mercedes"));
        cp.display();
    }

}
