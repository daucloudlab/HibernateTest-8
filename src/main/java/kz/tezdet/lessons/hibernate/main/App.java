package kz.tezdet.lessons.hibernate.main;

import kz.tezdet.lessons.hibernate.models.Student;
import kz.tezdet.lessons.hibernate.models.StudentAddress;
import kz.tezdet.lessons.hibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory() ;
        Session session = sessionFactory.openSession() ;
        Transaction tx = session.beginTransaction() ;

        Student student = new Student("Дәулет", "Баймбетов", "dauletbayymbetov@gmail.com", "8789876765" );
        StudentAddress studentAddress = new StudentAddress("Koktem-3", "Алматы", "Қазақстан");

        student.setAddress(studentAddress);
        studentAddress.setStudent(student);

        session.save(student);

        tx.commit();
        session.close();
    }
}
