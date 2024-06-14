package sr.unasat.ad.search.linear;

import sr.unasat.ad.models.Student;

public class LinearSearchService {

    public String findByProgrammingLanguage(String programmingLanguage, String[] programmingLanguageList) {
        for (int i = 0; i < programmingLanguageList.length; i++) {
            if (programmingLanguage.equals(programmingLanguageList[i])) {
                return "De text " + programmingLanguage + " is gevonden bij index: " + i; //term found return index
            }
        }
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
        for (int i = 0; i < studentList.length; i++) {
            if (studentNummer.equals(studentList[i].getStudentNummer())) {
                return studentList[i]; //term found return index
            }
        }
        return null; //term not found
    }

}
