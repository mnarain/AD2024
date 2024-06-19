package sr.unasat.ad.search.linear;

import sr.unasat.ad.models.Student;

public class LinearSearchService {
     //Big O notation: O(n)   linear
    //schrijf een linearSearch method die een int[] data en een int searchTerm als parameter accepteert
    public int findByNumber(int number, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                return i; //term found return index
            }
        }
        return -1; //term not found
    }



}
