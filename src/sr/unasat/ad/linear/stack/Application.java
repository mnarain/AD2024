package sr.unasat.ad.linear.stack;

public class Application {

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(10);
        stack.push(20);
        stack.push(89);
        stack.push(14);
        stack.push(786);
        stack.push(555);
        stack.isFull();
    }
}
