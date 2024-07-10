package sr.unasat.ad.linear.queue;

import sr.unasat.ad.models.Car;

/**
 * Created by mnarain on 7/7/2017.
 */
public class CircularQueue {
    private int maxSize;
    private Car[] queArray;
    private int front;
    private int rear;
    private int nItems;

    //--------------------------------------------------------------
    public CircularQueue(int maxSize) // constructor
    {
        this.maxSize = maxSize;
        queArray = new Car[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //--------------------------------------------------------------
    public void insert(Car car) // put item at rear of queue
    {
        boolean maxIndex = (rear == maxSize - 1);
        if (maxIndex && queArray[0] == null) { // deal with wraparound
            rear = -1;
            maxIndex = false;
        }

        if (!maxIndex && queArray[rear + 1] == null) {// check array out of bounds and
            queArray[++rear] = car; // increment rear and insert
            nItems++; // nItems gebruik je om te kijken hoeveel items je hebt insert in totaal
        }
    }

    //--------------------------------------------------------------
    public Car remove() // take item from front of queue
    {
        Car temp = queArray[front];//3 // get value and incr front
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
    public Car peekFront() // peek at front of queue
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
//--------------------------------------------------------------
} // end class Queue
