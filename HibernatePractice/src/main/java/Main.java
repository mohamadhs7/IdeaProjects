import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        //TestTable t1 = new TestTable("test1",true,125.00);
//        Employee e1 = new Employee();
//        e1.setName("Amir");
//        e1.setLastName("Sadeghi");
//        e1.setMarriage(true);
//        e1.setSalary(2000);

        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.getCurrentSession();
        Transaction tx= session.beginTransaction();

//        session.save(e1);
       // session.save(t1);

        Employee e2 =session.get(Employee.class,(long)1);
        e2.setDistrict("Sadeghie");
        session.save(e2);
            
        tx.commit();
    }
}
