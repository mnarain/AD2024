package sr.unasat.ad.search.binary;

import sr.unasat.ad.models.Student;
import sr.unasat.ad.search.linear.LinearSearchService;

public class Application {

    public static void main(String[] args) {
        BinarySearchService bss = new BinarySearchService();
        int[] numbers = {5, 9, 32, 67, 88, 90, 98, 100};
        bss.findByNumber(numbers, 32);
    }

}
