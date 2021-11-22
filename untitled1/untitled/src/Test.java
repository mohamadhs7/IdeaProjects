
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test {

    public static void main(String[] args)
    {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx= session.beginTransaction();

//Inheritance
//    Employee e1 = new Employee();
//    e1.setName("Jason");
//    e1.setBase_salary(2000);
//    Programmer p1 = new Programmer();
//    p1.setName("Alireza");
//    p1.setBase_salary(3000);
//    p1.setProgrammer_bonus(4000);
//    Manager m1 = new Manager();
//    m1.setRole("high");
//    m1.setManager_bonus(5000);
//    m1.setName("Sadeghi");

//        Manager m = session.load(Manager.class,3);
//        m.setBase_salary(500);
//        session.update(m);
//Inheritance


        //HQL
//        Query q=session.createQuery("from Book");
//        q.setFirstResult(50);
//        q.setMaxResults(50);
//        List<Book> b1 = q.list();
//        Query q=session.getNamedQuery("selectall");
//        q.setParameter("idvalue",10);
//        q.setParameter("titlevalue","last_title");
//        q.setInteger(0,Integer.parseInt("100"));
//        q.setInteger(1,Integer.parseInt("1"));
//        List<Book> b1 = q.list();
//        q.executeUpdate();
//        String sql = "select * from book";
//        SQLQuery sqlQuery = session.createSQLQuery(sql);
        //or
//        SQLQuery sqlQuery =session.getNamedNativeQuery("selectalll");
//        sqlQuery.addEntity(Book.class);
//        List<Book> books = sqlQuery.list();
//        Book books =session.load(Book.class,1);
//        Book books =session.get(Book.class,1);

//        Criteria cr = session.createCriteria(Book.class);
////        cr.add(Restrictions.eq("title","new_title"));
//        cr.add(Restrictions.between("id",5,10));
//        List<Book> books= cr.list();

//         explaining : criteria is used just for Conditions
//        Criteria cr = session.createCriteria(Book.class);
//        Criterion con1 = Restrictions.eq("title","new_title");
//        Criterion con2 = Restrictions.between("id",50,55);
//        Criterion con3 = Restrictions.(con1,con2);
//        cr.add(con3);
////        or
//       cr.add(con1).add(con2).add(con3);
//        cr.addOrder(Order.desc("id"));
//        Criterion like = Restrictions.like("title","%new_title%");
//        Criterion ilike = Restrictions.ilike("title","%New_Title%");
//        cr.add(ilike);
//        cr.add(Restrictions.le("id",8));
//        List<Book> books= cr.list();

//        Criteria cr = session.createCriteria(Book.class);
//        cr.setProjection(Projections.count("id"));
//            List<Long> count =cr.list();

//        Criteria cr = session.createCriteria(Book.class);
//        cr.setProjection(Projections.property("title"));
//        List<String> titles = cr.list();

//        Criteria cr = session.createCriteria(Book.class);
//        cr.setProjection(Projections.max("id"));
//        List<Integer> max = cr.list();

//        Criteria cr = session.createCriteria(Book.class);
//        cr.setProjection(Projections.distinct(Projections.property("title")));
//        cr.add(Restrictions.between("id",1,10));
//        cr.addOrder(Order.asc("title"));
//        List<String> titles = cr.list();
        //HQL



//Inheritance
//        session.save(e1);
//        session.save(p1);
//        session.save(m1);
//Inheritance

        //Object versioning and maintaining
        Employee e1 = new Employee();
        e1.setName("Amir");
        e1.setPassword("zedanesh79");
        session.save(e1);
        //Object versioning and maintaining

//HQl
//        for (int i =0;i<200;i++){
//            Book b = new Book();
//            b.setAuthor("Author"+i);
//            b.setTitle("Title"+i);
//            session.save(b);
//        }
        //HQl
        tx.commit();
        session.close();
//        for(String b:titles){
//            System.out.println(b.toString());
//        }
//        System.out.println(books.getBc().getBookCategory());
    }
}
