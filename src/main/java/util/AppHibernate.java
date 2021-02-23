package util;

import model.Student;
import repository.StudentRepository;

import java.util.List;

public class AppHibernate {
    public static void main(String[] args) {

        StudentRepository studentRepository = new StudentRepository();

        List<Student> studentList = studentRepository.findAll();
        System.out.println(studentList);
    }
}
