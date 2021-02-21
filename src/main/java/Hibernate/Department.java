package Hibernate;

import javax.persistence.*;

@Entity
@Table(name = "departmants")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "departmentId")
    private int departmentId;

    @Column(name = "name")
    private String name;

    public Department() {
    }

    public Department(int departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;
    }

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                '}';
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
