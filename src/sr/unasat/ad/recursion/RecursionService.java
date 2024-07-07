package sr.unasat.ad.recursion;

public class RecursionService {

    //count to ten imperative
    public void countToTenImperative() {

        for (int i = 1; i <= 10; i++) {
            if (i == 1) {
                System.out.println("this is the imperative aproach");
            }
            System.out.println(i);
        }
    }

    //count to ten recursive
    public void countToTenRecursive(int n, int recursiveCallCount) {
        if (n == 1) {
            System.out.println("this is the recursive aproach");
        }
        if (n > 5) {
            return;
        }
        System.out.println("recursiveCallCount " + recursiveCallCount);
        countToTenRecursive(n + 1, recursiveCallCount + 1);
        System.out.println("after recursive call " + n);
    }

    //imperative approach linear search
    public void findByNumberImperative(int number, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                System.out.println("term found at index: " + i);
                return;
            }
        }
        System.out.println("term not found");
    }

    //recursive approach linear search
    public void findByNumberRecursive(int number, int[] numbers, int index) {

        if (index >= numbers.length) { //base case
            System.out.println("term not found");
            return;
        }

        if (number == numbers[index]) {
            System.out.println("term found at index: " + index);
            return;
        }

        findByNumberRecursive(number, numbers,index+1);
    }

}


