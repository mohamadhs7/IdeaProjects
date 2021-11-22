

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main
{
    public static void main(String[]args)
    {
        Member m=new Member();
//        Address ads1 = new Address();

        m.setName("Alireza");
        m.setFamily("sadeghi");
//        ads1.setCity("Tehran");
//        m.getAddresses().add(ads1);
//        m.setAdss(ads1);
        MemberType mmbt1 =null;


//        MemberType mmbt =new MemberType();
//        mmbt.setTitle("Manager");
//        MemberType mmbt1 =new MemberType();
//        mmbt1.setTitle("Student");

//        mmbt1.getMembers().add(m);

        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.getCurrentSession();
        Transaction tx= session.beginTransaction();
//        session.save(mmbt1);
        mmbt1=session.load(MemberType.class,1);
        m.setMmbt(mmbt1);
       session.save(m);
//        m=session.get(Member.class,1);
//        session.delete(m);
//        System.out.println(m.toString());
//        session.save(mmbt);
        tx.commit();
        session.close();

//        System.out.println(id);
    }
}
