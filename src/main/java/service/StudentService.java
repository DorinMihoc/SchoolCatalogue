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
        //if sdtudent with name doesnt already exist in db - throw exception
        //eelse
        studentRepository.add(student);
    }
}
