package sr.unasat.ad.search.linear;

import sr.unasat.ad.models.Student;

public class Application {

    public static void main(String[] args) {
        LinearSearchService lss = new LinearSearchService();
        String[] programingLanguages = {"C", "C++", "Java", "Python",
                "JavaScript", "Ruby", "PHP", "Swift", "Kotlin", "Go"};
        String result = lss.findByProgrammingLanguage("Java", programingLanguages);
        System.out.println(result);

        result = lss.findByProgrammingLanguage("HTML", programingLanguages);
        System.out.println(result);


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("komt nummer 3 voor in de dataset?");
        int indexResult = lss.findByNumber(3, numbers);
        System.out.println(indexResult);
        System.out.println("komt nummer 20000 voor in de dataset?");
        indexResult = lss.findByNumber(20000, numbers);
        System.out.println(indexResult);

        Student[] studentList = {
                new Student("John", "Doe", "123456"),
                new Student("Jane", "Doe", "123457"),
                new Student("Alice", "Doe", "123458"),
                new Student("Bob", "Doe", "123459"),
                new Student("Eve", "Doe", "123460")
        };
        Student studentFound = lss.findByStudentNumber("123458", studentList);
        System.out.println(studentFound);

        studentFound = lss.findByStudentNumber("120058", studentList);
        System.out.println(studentFound);
    }

}
