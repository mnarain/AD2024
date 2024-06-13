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

    }

}
