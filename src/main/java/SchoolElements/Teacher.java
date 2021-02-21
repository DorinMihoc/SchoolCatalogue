package SchoolElements;

import javax.persistence.*;

@Entity
public class Teacher {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="TeacherId")
        private int studentId;
        @Column(name="firstName")
        private String firstName;
        @Column(name="lastName")
        private String lastName;

    public Teacher(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Teacher() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

