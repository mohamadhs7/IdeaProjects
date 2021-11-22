import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();


//        Book b = session.get(Book.class, 5);
//        b.setAuthor("new_Autjor");
//
//        Book other = session.get(Book.class, 5);
//
//        Book b = session.get(Book.class, 5);
//        b.setAuthor("new_Author57");

//        for(int i=1;i<=5;i++){
//            Book b = new Book();
//            b.setTitle("Title "+i);
//            b.setAuthor("Author "+i);
//            session.save(b);
//        }


        Query q1 =session.createQuery("from Book");
        q1.setCacheable(true);
        List<Book> books=q1.list();

        tx.commit();
        session.close();

        Session newsession =sf.openSession();
        newsession.beginTransaction();

        Query q2 =newsession.createQuery("from Book");
        q2.setCacheable(true);
        List<Book> books2=q2.list();

        newsession.getTransaction().commit();
        newsession.close();

//          System.out.println(other.toString());
    }
}
