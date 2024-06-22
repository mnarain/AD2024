package sr.unasat.ad.search.binary;

import sr.unasat.ad.models.Student;
import sr.unasat.ad.search.linear.LinearSearchService;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        BinarySearchService bss = new BinarySearchService();
        String[] programingLanguages = {"C", "C++", "Java", "Python",
                "JavaScript", "Ruby", "PHP", "Swift", "Kotlin", "Go"};
        String result = bss.findByProgrammingLanguage("Java", programingLanguages);
        System.out.println(result);

        result = bss.findByProgrammingLanguage("HTML", programingLanguages);
        System.out.println(result);


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("komt nummer 3 voor in de dataset?");
        int indexResult = bss.findByNumber(numbers, 3);
        System.out.println(indexResult);
        System.out.println("komt nummer 20000 voor in de dataset?");
        indexResult = bss.findByNumber(numbers, 20000);
        System.out.println(indexResult);

        Student[] studentList = {
                new Student("John", "Doe", "123456"),
                new Student("Jane", "Doe", "123457"),
                new Student("Alice", "Doe", "123458"),
                new Student("Bob", "Doe", "123459"),
                new Student("Eve", "Doe", "123460")
        };
        Arrays.sort(studentList, (a, b) -> a.getStudentNummer().compareTo(b.getStudentNummer()));
        Student studentFound = bss.findByStudentNumber("123458", studentList);
        System.out.println(studentFound);

        studentFound = bss.findByStudentNumber("120058", studentList);
        System.out.println(studentFound);
    }

}
