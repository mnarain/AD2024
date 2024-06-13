package sr.unasat.ad.search.linear;

public class LinearSearchService {

    public String linearSearchString(String searchTerm, String[] data) {
        for (int i = 0; i < data.length; i++) {
            if (searchTerm.equals(data[i])) {
                return "De text " + searchTerm + " is gevonden bij index: " + i; //term found return index
            }
        }
        return "De text " + searchTerm + " komt niet voor in deze dataset"; //term not found
    }

}
