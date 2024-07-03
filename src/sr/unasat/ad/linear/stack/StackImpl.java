package sr.unasat.ad.linear.stack;

/**
 * Created by mnarain on 6/28/2017.
 */
public class StackImpl {
    private int maxSize; // size of stack array
    private int[] stackArray;
    private int top; // top of stack

    public StackImpl(int size) // constructor
    {
        maxSize = size; // set array size
        stackArray = new int[maxSize]; // create array
        top = -1; // no items yet
    }

    public void push(int value) // put item on top of stack
    {
        stackArray[++top] = value; // increment top, insert item
    }


    public int pop() // take item from top of stack
    {
        return stackArray[top--]; // access item, decrement top
    }


    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }


    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }


    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }


    //gebruik deze method om de elementen in de stack om te draaien en achterste voren te tonen
    public int[] reverseOrderArray() {
        //pop from stack

        return null;
    }
//--------------------------------------------------------------
} // end class StackImpl
