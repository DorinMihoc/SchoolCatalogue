package model;

import javax.persistence.*;

@Entity
@Table(name = "Grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GradeId")
    private int gradeId;

    // Foreign keys
    @Column(name = "StudentId")
    private int studentId;
    @Column(name = "TeacherId")
    private int teacherId;
    @Column(name = "SubjectId")
    private int subjectId;
    @Column(name = "Grade")
    private double grade;
    @Column(name = "Absences")
    private char absences;

    public Grade() {
    }

    public Grade(int gradeId, int studentId, int teacherId, int subjectId, double grade, char absences) {
        this.gradeId = gradeId;
        this.studentId = studentId;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.grade = grade;
        this.absences = absences;
    }

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public char getAbsences() {
        return absences;
    }

    public void setAbsences(char absences) {
        this.absences = absences;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                ", subjectId=" + subjectId +
                ", grade=" + grade +
                ", absences=" + absences +
                '}';
    }
}
