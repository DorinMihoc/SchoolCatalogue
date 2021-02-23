package repository;

import model.Subject;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtils;

import javax.persistence.Query;
import java.util.List;

public class SubjectRepository {

    public boolean subjectExist(Subject subject) {
        return findById(subject.getSubjectId()) != null;
    }

    public SubjectRepository findById(int id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findById()");

        SubjectRepository subjectRepository = session.find(SubjectRepository.class, id);

        session.close();

        System.out.println("Return " + subjectRepository);
        return subjectRepository;
    }

    public void add(SubjectRepository subjectRepository) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for add()");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(subjectRepository);

        // end transaction
        transaction.commit();

        session.close();
    }

    public void update(Subject subject) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for update()");

        if (subjectExist(subject)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.update(subject);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Subject was not found:" + subject);
        }
    }

    public void delete(Subject subject) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for delete()");

        if (subjectExist(subject)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.delete(subject);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("Subject was not found:" + subject);
        }
    }

    public List<SubjectRepository> findAll() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findAll()");

        Query findAllQuery = session.createQuery("FROM Subject");
        List<SubjectRepository> subjectRepositoryList = findAllQuery.getResultList(); // era 'findAllQuery.list()'

        session.close();

        System.out.println("Return " + subjectRepositoryList.size());
        return subjectRepositoryList;
    }
}
