package repository;

import util.HibernateUtils;
import model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class StudentRepository {

    public boolean studentExist(Student student) {
        return findById(student.getStudentId()) != null;
    }

    public Student findById(int id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findById()");

        Student student = session.find(Student.class, id);

        session.close();

        System.out.println("Return " + student);
        return student;
    }

    public void add(Student student) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for add()");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(student);

        // end transaction
        transaction.commit();

        session.close();
    }

    public void update(Student student) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for update()");

        if (studentExist(student)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.update(student);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Student was not found:" + student);
        }
    }

    public void delete(Student student) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for delete()");

        if (studentExist(student)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.delete(student);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Student was not found:" + student);
        }
    }

    public List<Student> findAll() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findAll()");

        Query findAllQuery = session.createQuery("FROM Student");
        List<Student> studentList = findAllQuery.getResultList(); // era 'findAllQuery.list()'

        session.close();

        System.out.println("Return " + studentList.size());
        return studentList;
    }
}
