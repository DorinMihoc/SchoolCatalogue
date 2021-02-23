package model;

import javax.persistence.*;

@Entity
@Table(name = "ClassRoom")
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClassRoomId")
    private int classRoomId;
    @Column(name = "Name")
    private String name;
    @Column(name = "TeacherId")
    private int teacherId;
    @Column(name = "StudentId")
    private int studentId;

    public ClassRoom() {
    }

    public ClassRoom(int classRoomId, String name, int teacherId, int studentId) {
        this.classRoomId = classRoomId;
        this.name = name;
        this.teacherId = teacherId;
        this.studentId = studentId;
    }

    public int getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(int classRoomId) {
        this.classRoomId = classRoomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classRoomId=" + classRoomId +
                ", name='" + name + '\'' +
                ", teacherId=" + teacherId +
                ", studentId=" + studentId +
                '}';
    }
}
