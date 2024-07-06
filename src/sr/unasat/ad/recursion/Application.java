package sr.unasat.ad.recursion;

public class Application {

    public static void main(String[] args) {
        RecursionService rs = new RecursionService();
        rs.countToTenImperative();
        rs.countToTenRecursive(1, 1);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rs.findByNumberImperative(50, numbers);
        rs.findByNumberRecursive(50, numbers, 0);
    }

}
