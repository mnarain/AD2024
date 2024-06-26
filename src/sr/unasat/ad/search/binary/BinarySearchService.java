package sr.unasat.ad.search.binary;

import sr.unasat.ad.models.Student;

public class BinarySearchService {

    //schrijf een binarySearch methods voor onderstaande methoden
    //Time Complexity: O(log n)
    public int findByNumber(int[] sortedArray, int term) {
        int left = 0; // min index
        int right = sortedArray.length - 1; // max index
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (sortedArray[mid] == term) { // search term found
                return mid; // return sortedArray index of search term
            } else if (term < sortedArray[mid]) { // search term is smaller than mid point value
                right = mid - 1; // set right bound
            } else {
                left = mid + 1; // set left bound
            }
        }
        return -1;
    }



    public String findByProgrammingLanguage(String programmingLanguage, String[] programmingLanguageList) {
        int left = 0; // min index
        int right = programmingLanguageList.length - 1; // max index
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (programmingLanguageList[mid].equalsIgnoreCase(programmingLanguage)) { // search term found
                return programmingLanguageList[mid]; // return sortedArray value of search term
            } else if (programmingLanguage.compareToIgnoreCase(programmingLanguageList[mid]) < 0)   { // search term is smaller than mid point value
                right = mid - 1; // set right bound
            } else {
                left = mid + 1; // set left bound
            }
        }
        return "De text " + programmingLanguage + " komt niet voor in deze dataset"; //term not found
    }


   public Student findByStudentNumber(String studentNummer, Student[] studentList) {
       int left = 0; // min index
       int right = studentList.length - 1; // max index
       while (left <= right) {
           int mid = left + ((right - left) / 2);
           if (studentList[mid].getStudentNummer().equalsIgnoreCase(studentNummer)) { // search term found
               return studentList[mid]; // return sortedArray value of search term
           } else if (studentNummer.compareToIgnoreCase(studentList[mid].getStudentNummer()) < 0)   { // search term is smaller than mid point value
               right = mid - 1; // set right bound
           } else {
               left = mid + 1; // set left bound
           }
       }
        return null; //term not found
    }

}
