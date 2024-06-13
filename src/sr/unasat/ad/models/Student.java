package sr.unasat.ad.models;

public class Student {
    private String firstname;
    private String lastname;
    private String idNummer;

    public Student(String firstname, String lastname, String idNummer) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.idNummer = idNummer;
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

    public String getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(String idNummer) {
        this.idNummer = idNummer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", idNummer='" + idNummer + '\'' +
                '}';
    }
}
