package repository;

import model.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtils;

import javax.persistence.Query;
import java.util.List;

public class TeacherRepository {

    public boolean teacherExist(Teacher teacher) {
        return findById(teacher.getTeacherId()) != null;
    }

    public Teacher findById(int id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findById()");

        Teacher teacher = session.find(Teacher.class, id);

        session.close();

        System.out.println("Return " + teacher);
        return teacher;
    }

    public void add(Teacher teacher) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for add()");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(teacher);

        // end transaction
        transaction.commit();

        session.close();
    }

    public void update(Teacher teacher) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for update()");

        if (teacherExist(teacher)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.update(teacher);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Student was not found:" + teacher);
        }
    }

    public void delete(Teacher teacher) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for delete()");

        if (teacherExist(teacher)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.delete(teacher);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Teacher was not found:" + teacher);
        }
    }

    public List<Teacher> findAll() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findAll()");

        Query findAllQuery = session.createQuery("FROM Teacher");
        List<Teacher> teacherList = findAllQuery.getResultList(); // era 'findAllQuery.list()'

        session.close();

        System.out.println("Return " + teacherList.size());
        return teacherList;
    }

}
