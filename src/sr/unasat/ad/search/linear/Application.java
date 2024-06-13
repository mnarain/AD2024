package sr.unasat.ad.search.linear;

public class Application {

    public static void main(String[] args) {
        LinearSearchService lss =   new LinearSearchService();
        String[] programingLanguages = {"C", "C++", "Java", "Python",
                "JavaScript", "Ruby", "PHP", "Swift", "Kotlin", "Go"};
        String result = lss.linearSearchString("Java", programingLanguages);
        System.out.println(result);

        result = lss.linearSearchString("HTML", programingLanguages);
        System.out.println(result);


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("komt nummer 3 voor in de dataset?");
        int indexResult = lss.linearSearchInt(3, numbers);
        System.out.println(indexResult);
        System.out.println("komt nummer 20000 voor in de dataset?");
         indexResult = lss.linearSearchInt(20000, numbers);
        System.out.println(indexResult);

    }

}
