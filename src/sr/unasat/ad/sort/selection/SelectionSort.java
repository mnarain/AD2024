package sr.unasat.ad.sort.selection;

import sr.unasat.ad.models.Person;

public class SelectionSort {

    /*
    Time Complexity: O(n^2) as there are two nested loops.
    Auxiliary Space: O(1)
    The good thing about selection sort is it never makes
    more than O(n) swaps and can be useful
    when memory write is a costly operation.
    */

    static int[] sort(int[] array) {
        int size = array.length;
        // One by one move boundary of unsorted subarray
        for (int leftBoundUnsortedArrayIndex = 0; leftBoundUnsortedArrayIndex < size - 1; leftBoundUnsortedArrayIndex++) {
            // Find the minimum element in unsorted array
            int currentMinimumIndex = leftBoundUnsortedArrayIndex;
            for (int currentIndex = leftBoundUnsortedArrayIndex + 1; currentIndex < size; currentIndex++) {
                if (array[currentIndex] < array[currentMinimumIndex]) {
                    currentMinimumIndex = currentIndex;
                }
            }
            if (leftBoundUnsortedArrayIndex != currentMinimumIndex) {
                swap(array, leftBoundUnsortedArrayIndex, currentMinimumIndex);
            }
        }
        return array;
    }

    private static void swap(int[] array, int leftBound, int unsortedMinimum) {
        // Swap the found minimum element with the first
        // element
        int temp = array[unsortedMinimum];
        array[unsortedMinimum] = array[leftBound];
        array[leftBound] = temp;
    }

    //schrijf een selection sort gebaseert op een lijst van programming languages.
    //Tip gebruik een variant van de compareTo method. de fullname is niet case sensitive.
    public String[] sort(String[] programmingLanguageList) {
        //selection sort logica om een lijst van programming languages te sorteren

        return programmingLanguageList; //lijst van gesorteerde programming languages returnen
    }

    //schrijf een selection sort gebaseert op de persoon class en vergelijk de fullname van de personen.
    //Tip gebruik een variant van de compareTo method. de fullname is niet case sensitive.
    public Person[] sort(Person[] personList) {
        //selection logica om een lijst van personen te sorteren
        return personList; //lijst van gesorteerde personen returnen op basis van fullname
    }


}
