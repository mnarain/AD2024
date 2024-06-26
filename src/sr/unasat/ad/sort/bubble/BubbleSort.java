package sr.unasat.ad.sort.bubble;

import sr.unasat.ad.models.Person;
import sr.unasat.ad.models.Student;

public class BubbleSort {

    /*
    Time Complexity: O(n^2)
    Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
    Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
    Auxiliary Space: O(1)
    Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
    */
    public int[] sort(int[] array) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1; // set index of the last element
        while (!isSorted) {
            /*the for loop lets the highest value bubble up
            to make sure that the highest index contains the highest value*/
            for (int currentIndex = 0; currentIndex < lastUnsorted; currentIndex++) {
               /* if the current index value is bigger than
                the next index value, swap the index values*/
                if (array[currentIndex] > array[currentIndex + 1]) {
                    //    Swap.execute(array, currentIndex, currentIndex + 1);
                    // Swap the found minimum element with the first
                    // element
                    int temp = array[currentIndex + 1];
                    array[currentIndex + 1] = array[currentIndex];
                    array[currentIndex] = temp;
                }
            }
            lastUnsorted--;
            if (lastUnsorted < 1) {
                isSorted = true;
            }
        }
        return array;
    }


    //schrijf een bubblesort gebaseert op een lijst van programming languages.
    //Tip gebruik een variant van de compareTo method. de fullname is niet case sensitive.
    public String[] sort(String[] programmingLanguageList) {
        //bubblesort logica om een lijst van programming languages te sorteren
        boolean isSorted = false;
        int lastUnsorted = programmingLanguageList.length - 1; // set index of the last element
        while (!isSorted) {
            /*the for loop lets the highest value bubble up
            to make sure that the highest index contains the highest value*/
            for (int currentIndex = 0; currentIndex < lastUnsorted; currentIndex++) {
               /* if the current index value is bigger than
                the next index value, swap the index values*/
                if (programmingLanguageList[currentIndex].compareToIgnoreCase(programmingLanguageList[currentIndex + 1]) > 0) {
                    //    Swap.execute(array, currentIndex, currentIndex + 1);
                    // Swap the found minimum element with the first
                    // element
                    String temp = programmingLanguageList[currentIndex + 1];
                    programmingLanguageList[currentIndex + 1] = programmingLanguageList[currentIndex];
                    programmingLanguageList[currentIndex] = temp;
                }
            }
            lastUnsorted--;
            if (lastUnsorted < 1) {
                isSorted = true;
            }
        }
        return programmingLanguageList; //lijst van gesorteerde programming languages returnen
    }

    //schrijf een bubblesort gebaseert op de persoon class en vergelijk de fullname van de personen.
    //Tip gebruik een variant van de compareTo method. de fullname is niet case sensitive.
    public Person[] sort(Person[] personList) {
        //bubblesort logica om een lijst van personen te sorteren
        boolean isSorted = false;
        int lastUnsorted = personList.length - 1; // set index of the last element
        while (!isSorted) {
            /*the for loop lets the highest value bubble up
            to make sure that the highest index contains the highest value*/
            for (int currentIndex = 0; currentIndex < lastUnsorted; currentIndex++) {
               /* if the current index value is bigger than
                the next index value, swap the index values*/
                if (personList[currentIndex].getFullname().compareToIgnoreCase(personList[currentIndex + 1].getFullname()) > 0) {
                    //    Swap.execute(array, currentIndex, currentIndex + 1);
                    // Swap the found minimum element with the first
                    // element
                    Person temp = personList[currentIndex + 1];
                    personList[currentIndex + 1] = personList[currentIndex];
                    personList[currentIndex] = temp;
                }
            }
            lastUnsorted--;
            if (lastUnsorted < 1) {
                isSorted = true;
            }
        }
        return personList; //lijst van gesorteerde personen returnen op basis van fullname
    }
}
