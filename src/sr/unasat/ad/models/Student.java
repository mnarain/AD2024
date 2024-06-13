package sr.unasat.ad.models;

public class Student {
    private String firstname;
    private String lastname;
    private String studentNummer;

    public Student(String firstname, String lastname, String studentNummer) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentNummer = studentNummer;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentNummer() {
        return studentNummer;
    }

    public void setStudentNummer(String studentNummer) {
        this.studentNummer = studentNummer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", studentNummer='" + studentNummer + '\'' +
                '}';
    }
}
