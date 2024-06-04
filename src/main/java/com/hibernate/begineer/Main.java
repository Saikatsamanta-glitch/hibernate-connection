package com.hibernate.begineer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        student_table db = new student_table();
        db.setName("Python");
        db.setId(3);
        db.setAge(27);

        Configuration con = new Configuration().configure("hibernate.cfg.xml");
//        Session : its interface
//        SessionFactory sf = its interface
        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tran = session.beginTransaction();
        session.save(db); //insert the data
//        read | update and delete
        tran.commit();
    }
}

// 20min


// Transaction : adding multiple table data in data-base : It can fail : If a set of operation fails in between, it will rollback all operations
//1,2,3
//1,2 ... failed
//1,2 <---