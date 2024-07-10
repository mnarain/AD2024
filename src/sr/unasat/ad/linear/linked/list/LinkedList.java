package sr.unasat.ad.linear.linked.list;

import sr.unasat.ad.models.Car;

public class LinkedList {
    private Link first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(Car car) {
        Link newLink = new Link(car);
        newLink.next = first;
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;     //link met 27
        first = first.next;    //first wordt 94
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println("");
    }
}
