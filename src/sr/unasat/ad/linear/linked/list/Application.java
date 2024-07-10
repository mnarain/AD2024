package sr.unasat.ad.linear.linked.list;

import sr.unasat.ad.models.Car;

public class Application {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(new Car("Toyota"));
        linkedList.insertFirst(new Car("Honda"));
        linkedList.insertFirst(new Car("BMW"));
        linkedList.insertFirst(new Car("Audi"));
        linkedList.insertFirst(new Car("Mercedes"));
        linkedList.displayList();
    }
}
