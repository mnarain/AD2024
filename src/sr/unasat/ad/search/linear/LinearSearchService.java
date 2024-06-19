package sr.unasat.ad.search.linear;

import sr.unasat.ad.models.Student;

public class LinearSearchService {

    public String findByProgrammingLanguage(String programmingLanguage, String[] programmingLanguageList) {

        return "De text " + programmingLanguage + " komt niet voor in deze dataset"; //term not found
    }

    //schrijf een linearSearch method die een int[] data en een int searchTerm als parameter accepteert
    public int findByNumber(int number, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                return i; //term found return index
            }
        }
        return -1; //term not found
    }


    //schrijf een linearSearch method die een Student[] data en een studentNummer searchTerm als parameter accepteert
    public Student findByStudentNumber(String studentNummer, Student[] studentList) {

        return null; //term not found
    }

}
