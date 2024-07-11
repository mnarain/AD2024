package sr.unasat.ad.linear.linked.list;

import sr.unasat.ad.models.Car;

public class DoubleEndedLinkedList {
    private Link first;

    public DoubleEndedLinkedList() {
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

    public Link find(String carName) // find link with given key
    { // (assumes non-empty list)
        Link current = first; // start at ‘first’
        while(!current.car.getName().equalsIgnoreCase(carName) ) // while no match,
        {
            if(current.next == null) // if end of list,
                return null; // didn’t find it
            else // not end of list,
                current = current.next; // go to next link
        }
        return current; // found it
    }

    public Link delete(String carName) // delete link with given key
    { // (assumes non-empty list)
        Link current = first; // search for link
        Link previous = first;
        while(!current.car.getName().equalsIgnoreCase(carName))
        {
            if(current.next == null)
                return null; // didn’t find it
            else
            {
                previous = current; // go to next link
                current = current.next;
            }
        } // found it
        if(current == first) // if first link,
            first = first.next; // change first
        else // otherwise,
            previous.next = current.next; // bypass it
        return current;
    }

}
