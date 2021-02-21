package repository;

import util.HibernateUtils;
import model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentRepository {
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

//    public void update(Student student) {
//        Session session = HibernateUtils.getSessionFactory().openSession();
//        System.out.println("Hibernate session started for update()");
//
//        if (studentExist(student)) {
//            Transaction transaction = session.beginTransaction();
//
//            // actual save into DB
//            session.update(student);
//
//            // end transaction
//            transaction.commit();
//
//            session.close();
//        } else {
//            System.out.println("Dept was not found:" + dept);
//        }
//    }
//
//
//    public void delete(Department dept) {
//        Session session = HibernateUtils.getSessionFactory().openSession();
//        System.out.println("Hibernate session started for delete()");
//
//        if (departmentExists(dept)) {
//            Transaction transaction = session.beginTransaction();
//
//            // actual save into DB
//            session.delete(dept);
//
//            // end transaction
//            transaction.commit();
//
//            session.close();
//        } else {
//            System.out.println("Dept was not found:" + dept);
//        }
//    }
//
//    public boolean departmentExists(Department dept) {
//        return findById(dept.getDepartmentId()) != null;
//    }
//
//    public List<Department> findAll() {
//        Session session = HibernateUtils.getSessionFactory().openSession();
//        System.out.println("Hibernate session started for findAll()");
//
//        Query findAllQuery = session.createQuery("FROM Department");
//        List<Department> departmentsList = findAllQuery.list();
//
//        session.close();
//
//        System.out.println("Return " + departmentsList.size());
//        return departmentsList;
//    }
//
//    public Department findById(int id) {
//        Session session = HibernateUtils.getSessionFactory().openSession();
//        System.out.println("Hibernate session started for findById()");
//
//        Department dept = session.find(Department.class, id);
//
//        session.close();
//
//        System.out.println("Return " + dept);
//        return dept;
//    }
//
//
//}

}
