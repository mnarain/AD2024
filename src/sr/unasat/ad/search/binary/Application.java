package sr.unasat.ad.search.binary;

import sr.unasat.ad.models.Student;
import sr.unasat.ad.search.linear.LinearSearchService;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        BinarySearchService bss = new BinarySearchService();
        int[] numbers = {5, 9, 32, 67, 88, 90, 98, 100};
        bss.findByNumber(numbers, 32);

        String[] programingLanguages = {"C", "C++", "Java", "Python",
                "JavaScript", "Ruby", "PHP", "Swift", "Kotlin", "Go"};
        Arrays.sort(programingLanguages);
        String searchTermFound = bss.findByProgrammingLanguage("JAva", programingLanguages);
        System.out.println(searchTermFound);

        searchTermFound = bss.findByProgrammingLanguage("Ruby", programingLanguages);
        System.out.println(searchTermFound);

        searchTermFound = bss.findByProgrammingLanguage("fstgre", programingLanguages);
        System.out.println(searchTermFound);
    }

}
