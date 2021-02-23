package service;

import model.Student;
import repository.StudentRepository;

public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void add(Student student) {
        //if student age is invalid
        //if student with name doesn't already exist in db - throw exception
        //else
        studentRepository.add(student);
    }
}
