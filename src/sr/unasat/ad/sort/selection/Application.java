package sr.unasat.ad.sort.selection;

import static sr.unasat.ad.sort.selection.SelectionSort.sort;

public class Application {
    public static void main(String[] args) {
        int[] array = {105, 2, 30, 4, 3000, 5, 70, 14, 7, 0};
        System.out.println(array);
        int[] sortedArray = sort(array);
        for (int element : sortedArray) {
            System.out.println(element);
        }
    }
}
