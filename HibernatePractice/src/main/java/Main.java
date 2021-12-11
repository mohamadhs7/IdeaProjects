import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TestTable t1 = new TestTable("test1",true,125.00);
//        Employee e1 = new Employee();
//        e1.setName("Amir");
//        e1.setLastName("Sadeghi");
//        e1.setMarriage(true);
//        e1.setSalary(2000);

//        Customer c1 = new Customer();
//        //c1.setId("C00026");
//        c1.setCity("Tehran");
//        c1.setCountry("Iran");
//        c1.setGrade(BigDecimal.valueOf(4));
//        c1.setName("Ali");
//        c1.setPaymentAmount(BigDecimal.valueOf(5500.00));
//        c1.setWorkingArea("Argentina");

        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.getCurrentSession();
        Transaction tx= session.beginTransaction();

//        Criteria cr = session.createCriteria(Customer.class);
//        ProjectionList projectionList = Projections.projectionList();
//        projectionList.add(Projections.alias(Projections.property("workingArea"),"workingArea"));
//        projectionList.add(Projections.alias(Projections.sum("paymentAmount"),"sum"));
//        projectionList.add(Projections.groupProperty("workingArea"));
//        cr.setProjection(projectionList);
//        Criterion co =Restrictions.eq("workingArea","Torento");
//        cr.add(co);
//        cr.setResultTransformer(cr.ALIAS_TO_ENTITY_MAP);
//        List Result =  cr.list();

//        Query q =session.createQuery("select c.workingArea , sum (c.paymentAmount) from Customer as c where c.workingArea='Torento'group by c.workingArea");
//        Map<String,Double> customers = (Map) q.list();
//        System.out.println(customers.size());

//        Query q =session.createQuery("select c.workingArea , sum (c.paymentAmount) from Customer as c where c.workingArea='Torento'group by c.workingArea");
//        Map<String,Long> map1= (Map<String, Long>) q.list();
//        System.out.println(map1.size());








//        session.save(e1);
       // session.save(t1);

//        Employee e2 =session.get(Employee.class,(long)1);
//        e2.setDistrict("Sadeghie");
//        session.save(e2);

       // session.save(c1);



        tx.commit();
        session.close();

//        System.out.println(customers.toString());

//        System.out.println(customers.toString());

//        for (Iterator iterator = map1.iterator(); iterator.hasNext();) {
//            Map map = (Map) iterator.next();
//            System.out.println("Working Area: " + map.get("workingArea"));
//            System.out.println("SUM(): " + map.get("sum"));
//        }

//        for (Customer c:map){
//            System.out.println(c.toString());
//        }
    }
}
