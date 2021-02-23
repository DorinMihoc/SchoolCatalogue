package repository;

import model.ClassRoom;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtils;

public class ClassRoomRepository {

    public boolean ClassRoomRepositoryExist(ClassRoom classRoom) {
        return findById(classRoom.getClassRoomId()) != null;
    }

    public boolean classRoomExist(ClassRoom classRoom) {
        return findById(classRoom.getClassRoomId()) != null;
    }

    public ClassRoom findById(int id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for findById()");

        ClassRoom classRoom = session.find(ClassRoom.class, id);

        session.close();

        System.out.println("Return " + classRoom);
        return classRoom;
    }

    public void add(ClassRoom classRoom) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for add()");

        Transaction transaction = session.beginTransaction();

        // actual save into DB
        session.save(classRoom);

        // end transaction
        transaction.commit();

        session.close();
    }

    public void update(ClassRoom classRoom) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        System.out.println("Hibernate session started for update()");

        if (classRoomExist(classRoom)) {
            Transaction transaction = session.beginTransaction();

            // actual save into DB
            session.update(classRoom);

            // end transaction
            transaction.commit();

            session.close();
        } else {
            System.out.println("ClassRoom was not found:" + classRoom);
        }
    }
}
