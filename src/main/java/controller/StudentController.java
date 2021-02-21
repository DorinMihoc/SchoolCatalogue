package controller;

import model.Student;
import repository.StudentRepository;
import service.StudentService;

public class StudentController {
    StudentService studentService;
    StudentRepository studentRepository;

    public StudentController(){
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
    }
    //public void addStudent(String name, String lastName){
    //Stunde s1 = new Stundet (name, lastyNAme)
    public void addStudent(Student student){
        //---
        studentService.add(student);
    }
}
