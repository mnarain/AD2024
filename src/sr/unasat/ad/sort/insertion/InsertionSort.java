package sr.unasat.ad.sort.insertion;

import sr.unasat.ad.models.Person;

public class InsertionSort {

    /*
        Time Complexity: O(n^2)
        Auxiliary Space: O(1)
        Boundary Cases:
        Insertion sort takes maximum time
        to sort if elements are sorted in reverse order.

        And it takes minimum time (Order of n)
        when elements are already sorted.
       */
    public int[] sort(int[] array) {
        int size = array.length;
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < size; ++firstUnsortedIndex) { //2
            int firstUnsortedValue = array[firstUnsortedIndex];
            int sortedIndex = firstUnsortedIndex - 1;

            /* Move elements of array[0..firstUnsortedIndex-1], that are
               greater than firstUnsortedValue, to one position ahead
               of their current position */
            while (sortedIndex >= 0 && array[sortedIndex] > firstUnsortedValue) {
                //swap values of sorted part that are higher
                array[sortedIndex + 1] = array[sortedIndex];
                sortedIndex = sortedIndex - 1; //-1
            }
            array[sortedIndex + 1] = firstUnsortedValue;
        }
        return array;
    }


    //schrijf een insertion sort gebaseert op een lijst van programming languages.
    //Tip gebruik een variant van de compareTo method. de fullname is niet case sensitive.
    public String[] sort(String[] programmingLanguageList) {
        //insertion sort logica om een lijst van programming languages te sorteren

        return programmingLanguageList; //lijst van gesorteerde programming languages returnen
    }

    //schrijf een insertion sort gebaseert op de persoon class en vergelijk de fullname van de personen.
    //Tip gebruik een variant van de compareTo method. de fullname is niet case sensitive.
    public Person[] sort(Person[] personList) {
        //insertion logica om een lijst van personen te sorteren
        return personList; //lijst van gesorteerde personen returnen op basis van fullname
    }


}
