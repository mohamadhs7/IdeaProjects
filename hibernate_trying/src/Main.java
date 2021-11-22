import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    public static void main(final String[] args) throws Exception {

      employee m=new employee();
        m.setId(7);
        m.setFirst_name("mohamadh");
        m.setLast_name("sadeghi");
        m.setSalary(1500);

        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();

        Transaction tx= session.beginTransaction();
        session.save(m);
        tx.commit();
        session.close();
    }
}