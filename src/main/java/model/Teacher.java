package model;

import javax.persistence.*;

@Entity
@Table(name = "Teacher")
public class Teacher {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="TeacherId")
        private int teacherId;
        @Column(name="firstName")
        private String firstName;
        @Column(name="lastName")
        private String lastName;
        @Column(name = "Discipline")
        private String discipline;

    public Teacher(int teacherId, String firstName, String lastName, String discipline) {
        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.discipline = discipline;
    }

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}

