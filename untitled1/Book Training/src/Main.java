import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        Employee e1 = new Employee();
//        e1.setName("ALi");
//
//        Department de1=new Department();
//        de1.setName("Riazi");
//
//        e1.setDepartment(de1);

//        session.save(de1);
//        session.save(e1);

//        Criteria criteria = session.createCriteria(Employee.class);
//        criteria.createAlias("department", "dept");
//        criteria.add(Restrictions.eq("dept.name", "Riazi"));
//        List <Employee> list = criteria.list();

//        Query q1 = session.createQuery("from Employee where name=:name");
//        q1.setParameter("name","ALi");
//        List <Employee> employees = q1.list();
//        Location l1 = new Location();
//        l1.setName("Ferdos Blvd");
//        de1.setLocation(l1);

//        Criteria criteria = session.createCriteria(Employee.class);
//        criteria.createAlias("department", "dept");
//        criteria.createAlias("dept.location", "loc");
//        criteria.add(Restrictions.eq("loc.name", "Ferdos Blvd"));
//        List  list = criteria.list();

//        session.save(l1);
//        session.save(de1);
//        session.save(e1);

//        Date d1 =new Date();
//        Date d2 =new Date();
//
//        Category c1 = new Category();
//        c1.setName("HighSchool");
//        c1.setCreatedOn(d1);
//
//        Category c2 = new Category();
//        c2.setName("ElamentrySchool");
//        c2.setCreatedOn(d2);
//
//        Product p1 =new Product();
//        p1.setName("Aval_Dabirstan");
//        p1.setPrice(1400);
//        p1.setCategory(c1);
//
//        Product p2 =new Product();
//        p2.setName("Dovom_Dabirstan");
//        p2.setPrice(1600);
//        p2.setCategory(c1);
//
//        Product p3 =new Product();
//        p3.setName("Aval_Ebtedae");
//        p3.setPrice(800);
//        p3.setCategory(c2);
//
//        session.save(p1);
//        session.save(p2);
//        session.save(p3);


//        Criteria criteria = session.createCriteria(Product.class);
//        criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//        List list = criteria.list();
////        System.out.println("List: " + list);
//        Map map = (Map) list.get(1);
//        Product productMap = (Product) map.get(Criteria.ROOT_ALIAS);
//        System.out.println(productMap.toString());

//        Criteria cr = session.createCriteria(Product.class);
//        Criterion co1 =Restrictions.gt("price",1404.00);
//        cr.createAlias("category","cat");
//       Criterion co2 =Restrictions.eq("cat.name","HighSchool");
//       Criterion co3= Restrictions.and(co1,co2);
//       cr.add(co3);
//        List<Product> list =cr.list();

//   Criteria cr = session.createCriteria(Product.class);
//
//        ProjectionList projectionList = Projections.projectionList();
//        projectionList.add(Projections.alias(Projections.property("name"),"Product_name"));
//        projectionList.add(Projections.alias(Projections.property("price"),"Product_price"));
//        cr.setProjection(projectionList);
//        cr.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
//        List list = cr.list();
//        System.out.println(list);

//        Employee em = new Employee();
//        em.setName("Ali");
//
//        Degree d1 = new Degree("Lisans",1391);
//        Degree d2 = new Degree("FoghLisans",1395);
//        List<Degree> degrees = new ArrayList<Degree>();
//        degrees.add(d1);
//        degrees.add(d2);
//        em.setDegrees(degrees);
////
//        d1.setEmployee(em);
//        d2.setEmployee(em);
//        session.save(d1);
//        session.save(d2);
//        session.save(em);

//        Degree d = new Degree();
//        d.setId(2l);
//        session.delete(d);

//        PassportDetail detail = new PassportDetail();
//        detail.setPassportNo("G51546645");
//
//        Person person = new Person();
//        person.setName("Vishal");
//        person.setPassportDetail(detail);
//
//
//        session.save(person);

//        Employee e1 = session.get(Employee.class,1l);
//        System.out.println(e1.toString());


//        Criteria criteria = session.createCriteria(Product.class);
//        ProjectionList projectionList = Projections.projectionList();
//        /* Line 4 */projectionList.add(Projections.groupProperty("category"));
//        /* Line 6 */ projectionList.add(Projections.sum("price"));
//        criteria.createAlias("category", "category");
//        projectionList.add(Projections.property("category.name"));
//        criteria.setResultTransformer(Transformers.TO_LIST);
//        criteria.setProjection(projectionList);
//        List <Product> list = criteria.list();
//

//        Query q = session.createQuery("SELECT id,name from Category");
//       Map<Long,String> list = (Map) q.list();
//        System.out.println(list.size());

//        PassportDetail detail = new PassportDetail();
//        detail.setPassportNo("G51546645");
//        Person person = new Person();
//        person.setName("Vishal");
//
//        person.setPassportDetail(detail);
//        session.save(person);

//        Criteria criteria = session.createCriteria(Person.class);
//        Person person = (Person) criteria.uniqueResult();
//        System.out.println(person.toString());

//        Detail detail = new Detail();
//        detail.setCity("AHM");
//        Employee employee = new Employee();
//        employee.setName("vishal");
//        employee.setEmployeeDetail(detail);
//        session.save(employee);

//        PassportDetail detail = new PassportDetail();
//        detail.setPassportNo("G44244781");
//        Person person = new Person();
//        person.setId(1);
//        person.setName("Virendra");
//        person.setPassportDetail(detail);
//        session.save(person);

//        Movie m1 = new Movie();
//        m1.setName("SorkhPoost");
//        Movie m2 = new Movie();
//        m2.setName("Badigard");
//
//        Actor a1 = new Actor();
//        a1.setName("Navid");
//        Actor a2 = new Actor();
//        a2.setName("Parviz");
//
//        a1.setMovie(m1);
//        a2.setMovie(m2);
//
//
//
//        session.save(a1);
//        session.save(a2);

//        Criteria cr = session.createCriteria(Movie.class);
//        cr.add(Restrictions.eq("name","SorkhPoost"));
//        Movie movie =(Movie) cr.uniqueResult();
//
//        Actor a3 = new Actor();
//        a3.setName("Parinaz");
//        a3.setMovie(movie);
//
//        session.save(a3);

//        Criteria cr = session.createCriteria(Movie.class);
//        cr.add(Restrictions.eq("name","SorkhPoost"));
//        Movie movie =(Movie) cr.uniqueResult();
//
//        List<Actor> actors = movie.getActors();
//        for (Actor a:actors){
//            System.out.println(a.getName());
//        }

//        Criteria criteria = session.createCriteria(Product.class);
//        ProjectionList projectionList = Projections.projectionList();
//        /* Line 4 */projectionList.add(Projections.groupProperty("category"));
//        /* Line 6 */ projectionList.add(Projections.alias(Projections.sum("price"), "price"));
//        criteria.createAlias("category", "category");
//        projectionList.add(Projections.alias(Projections.property("category.name"), "cat_name"));
//                criteria.setProjection(projectionList);
//        criteria.setResultTransformer(criteria.ALIAS_TO_ENTITY_MAP);
//        List list = criteria.list();
//        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//            Map map = (Map) iterator.next();
//            System.out.println("Category name: " + map.get("cat_name"));
//            System.out.println("SUM(price): " + map.get("price"));
//        }
//        Date d1 = new Date();
//         Category c1 = new Category();
//         c1.setName("Furniture");
//        c1.setCreatedOn(d1);
//
//
//        Category c2 = new Category();
//        c2.setName("Stationary");
//        c2.setCreatedOn(d1);
//
//        ArrayList<String> product_names = new ArrayList<String>();
//        product_names.add(0," Meeting room table ");
//        product_names.add(1," Metal bookcases ");
//        product_names.add(2," Lighting ");
//        product_names.add(3," Business envelopes ");
//        product_names.add(4," Paper clips ");
//        product_names.add(5," Highlighters ");
//
//        ArrayList<Double> product_prices = new ArrayList<Double>();
//        product_prices.add(0,100.23);
//        product_prices.add(1,120.00);
//        product_prices.add(2,70.36);
//        product_prices.add(3,40.92);
//        product_prices.add(4,20.61);
//        product_prices.add(5,30.00);
//
//
//        for (int i=0;i<3;i++){
//            Product p = new Product();
//            p.setName(product_names.get(i));
//            p.setPrice(product_prices.get(i));
//            p.setCategory(c1);
//            session.save(p);
//        }
//        for (int i=3;i<=5;i++){
//            Product p = new Product();
//            p.setName(product_names.get(i));
//            p.setPrice(product_prices.get(i));
//            p.setCategory(c2);
//            session.save(p);
//        }

        Criteria criteria = session.createCriteria(Product.class);
        ProjectionList projectionList = Projections.projectionList();
        /* Line 4 */projectionList.add(Projections.groupProperty("category"));
        /* Line 6 */ projectionList.add(Projections.alias(Projections.sum("price"), "price"));
        criteria.createAlias("category", "category");
        projectionList.add(Projections.alias(Projections.property("category.name"), "cat_name"));
                criteria.setProjection(projectionList);
        criteria.setResultTransformer(criteria.ALIAS_TO_ENTITY_MAP);
        List list = criteria.list();
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Map map = (Map) iterator.next();
            System.out.println("Category name: " + map.get("cat_name"));
            System.out.println("SUM(price): " + map.get("price"));
        }

        tx.commit();
        session.close();

//        for(Iterator iterator = list.iterator(); iterator.hasNext();) {
//            System.out.println(iterator.toString());
//        }





//        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
//            Map map = (Map) iterator.next();
//            System.out.println("Category name: " + map.get("cat_name"));
//            System.out.println("SUM(price): " + map.get("price"));
//        }

//
//        for (Product p:list){
//            System.out.println(p.toString());
//        }
//        for (Object e:list) {
//            System.out.println(e);
//
        }
    }

