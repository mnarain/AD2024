package sr.unasat.ad.search.binary;

import sr.unasat.ad.models.Student;

public class BinarySearchService {

    //schrijf een binarySearch methods voor onderstaande methoden

    public int findByNumber(int number, int[] numbers) {

        return -1; //term not found
    }

    public String findByProgrammingLanguage(String programmingLanguage, String[] programmingLanguageList) {

        return "De text " + programmingLanguage + " komt niet voor in deze dataset"; //term not found
    }


   public Student findByStudentNumber(String studentNummer, Student[] studentList) {

        return null; //term not found
    }

}
