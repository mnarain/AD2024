package sr.unasat.ad.linear.queue;

import sr.unasat.ad.models.Car;
import sr.unasat.ad.models.Customer;

public class Application {

    public static void main(String[] args) {
/*        CarPriorityQueue cp = new CarPriorityQueue(5);
        cp.insert(new Car(4, "Toyota"));
        cp.insert(new Car(2, "Honda"));
        cp.insert(new Car(1, "BMW"));
        cp.insert(new Car(5, "Audi"));
        cp.insert(new Car(3, "Mercedes"));
        cp.display();*/
        CustomerPriorityQueue customerPriorityQueue = new CustomerPriorityQueue(5);
        //insert 5 Customer objects
        customerPriorityQueue.insert(new Customer("John", "Levi"));
        customerPriorityQueue.insert(new Customer("Jane", "Doe"));
        customerPriorityQueue.insert(new Customer("John", "Icaza"));
        customerPriorityQueue.insert(new Customer("Jane", "Smith"));
        customerPriorityQueue.insert(new Customer("John", "Danhoe"));
        customerPriorityQueue.display();
    }

}
