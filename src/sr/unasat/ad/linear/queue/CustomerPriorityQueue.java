package sr.unasat.ad.linear.queue;
import sr.unasat.ad.models.Car;
import sr.unasat.ad.models.Customer;

/**
 * Created by mnarain on 7/7/2017.
 */
public class CustomerPriorityQueue {
    private int maxSize;
    private Customer[] queArray;
    private int front;
    private int rear;
    private int nItems;

    //--------------------------------------------------------------
    public CustomerPriorityQueue(int maxSize) // constructor
    {
        this.maxSize = maxSize;
        queArray = new Customer[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //--------------------------------------------------------------
    public void insert(Customer customer) // put item at rear of queue
    {
        int currentIndex;
        if (nItems == 0) { // if no items,
            queArray[nItems++] = customer; // insert at 0
        } else // if items,
        {
            for (currentIndex = nItems - 1; currentIndex >= 0; currentIndex--) // start at end,
            {
                if (customer.getFullName().compareToIgnoreCase(queArray[currentIndex].getFullName()) < 0) // if new item smaller,
                    queArray[currentIndex + 1] = queArray[currentIndex]; // shift upward
                else // if smaller,
                    break; // done shifting
            } // end for
            queArray[currentIndex + 1] = customer; // insert it
            nItems++;
        } // end else (nItems > 0)
    } // end insert()
//-------------------------------------------------------------


    //--------------------------------------------------------------
    public Customer remove() // take item from front of queue
    {
        Customer temp = queArray[front];//3 // get value and incr front
        queArray[front] = null;//3 removed
        if (front + 1 == maxSize) { // deal with wraparound
            front = 0;
        } else {
            front++;
        }
        nItems--;// one less item
        return temp;
    }

    //--------------------------------------------------------------
    public Customer peekFront() // peek at front of queue
    {
        return queArray[front];
    }

    //--------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }

    //--------------------------------------------------------------
    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }

    //--------------------------------------------------------------
    public int size() // number of items in queue
    {
        return nItems;
    }


    public void display() {
        for (int i = 0; i < nItems; i++) {
            System.out.println(queArray[i]);
        }
    }
//--------------------------------------------------------------
} // end class Queue
