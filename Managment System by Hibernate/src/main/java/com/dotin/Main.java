package com.dotin;

import com.dotin.entities.Employee;
import com.dotin.entities.Manager;
import com.dotin.entities.Role;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

//        List<LocalDate> impossibleOffReqM=new ArrayList<>();
//        impossibleOffReqM.add(LocalDate.of(2000,10,28));
//        impossibleOffReqM.add(LocalDate.of(2000,10,29));
//        impossibleOffReqM.add(LocalDate.of(2000,10,30));
//
//        List<LocalDate> impossibleOffReqM2=new ArrayList<>();
//        impossibleOffReqM2.add(LocalDate.of(2000,10,1));
//        impossibleOffReqM2.add(LocalDate.of(2000,10,2));
//        impossibleOffReqM2.add(LocalDate.of(2000,10,3));

//        List<LocalDate> e2OffReqDates=new ArrayList<>();
//            e2OffReqDates.add(LocalDate.of(2000,8,1));
//            e2OffReqDates.add(LocalDate.of(2000,8,2));
//            e2OffReqDates.add(LocalDate.of(2000,8,3));
//            e2OffReqDates.add(LocalDate.of(2000,8,4));
//
//            List<LocalDate> e3OffReqDates=new ArrayList<>();
//            e3OffReqDates.add(LocalDate.of(2000,10,30));
//            e3OffReqDates.add(LocalDate.of(2000,11,1));
//            e3OffReqDates.add(LocalDate.of(2000,11,2));
//            e3OffReqDates.add(LocalDate.of(2000,11,3));


//        Manager m1 = new Manager("Ahmad","Ahmadi",impossibleOffReqM, Role.Developer);
//        Manager m2 = new Manager("Ali","Alavi",impossibleOffReqM2, Role.Developer);
//
//        Employee e1 = new Employee("Hossein","Hosseini",Role.Developer,3,m2);
//        Employee e2 = new Employee("Hadis","Hadisi",Role.Tester,4,m2);
//        Employee e3 = new Employee("Arash","Arashi",Role.Developer,3,m2);
//        Employee e4 = new Employee("Taghi","taghavi",Role.Developer,3,m1);
//        Employee e5 = new Employee("Ehsan","Ehsani",Role.Tester,4,m1);


//       session.save(e1);
//       session.save(e2);
//       session.save(e3);
//       session.save(e4);
//       session.save(e5);


//        Employee e =session.load(Employee.class,4l);
//        e.offRequest(e3OffReqDates);
//        session.save(e);


//
//            Criteria cr =session.createCriteria(Employee.class);
//            cr.add(Restrictions.eq("offRequset",true));
//            cr.createAlias("manager","manager");
//            cr.add(Restrictions.eq("manager.id",2l));
//            List<Employee> employees = cr.list();



//            Manager m =session.get(Manager.class,2l);
//            m.answeroffRequests(employees);




        tx.commit();


//        for(Employee e:employees){
//            System.out.println(e.toString());
//        }
    }
}