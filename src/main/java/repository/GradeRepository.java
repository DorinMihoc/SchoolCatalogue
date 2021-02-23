package repository;

import model.Grade;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class GradeRepository {

    public boolean GradeRepositoryExist(Grade grade) {
        return findById(grade.getGradeId()) != null;
    }

    public boolean gradeExist(Grade grade) {
        return findById(grade.getGradeId()) != null;
    }

    public Grade findById(int id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findById()");

        Grade grade = session.find(Grade.class, id);

        session.close();

        System.out.println("Return " + grade);
        return grade;
    }

    public void add(Grade grade) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for add()");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(grade);

        // end transaction
        transaction.commit();

        session.close();
    }

    public void update(Grade grade) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for update()");

        if (gradeExist(grade)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.update(grade);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Grade was not found:" + grade);
        }
    }

}
