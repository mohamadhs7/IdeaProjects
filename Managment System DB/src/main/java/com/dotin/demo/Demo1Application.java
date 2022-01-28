package com.dotin.demo;

import com.dotin.demo.entities.Employee;
import com.dotin.demo.entities.Manager;
import com.dotin.demo.entities.Role;
import com.dotin.demo.repositories.EmployeeRepository;
import com.dotin.demo.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Demo1Application {

    @Autowired
    EmployeeRepository empRepo;

    @Autowired
    ManagerRepository mngRepo;


    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {

//            List<LocalDate> impossibleOffReqM=new ArrayList<>();
//            impossibleOffReqM.add(LocalDate.of(2000,10,28));
//            impossibleOffReqM.add(LocalDate.of(2000,10,29));
//            impossibleOffReqM.add(LocalDate.of(2000,10,30));
//
//            List<LocalDate> e2OffReqDates=new ArrayList<>();
//            e2OffReqDates.add(LocalDate.of(2000,8,1));
//            e2OffReqDates.add(LocalDate.of(2000,8,2));
//            e2OffReqDates.add(LocalDate.of(2000,8,3));
//            e2OffReqDates.add(LocalDate.of(2000,8,4));
//////
//            List<LocalDate> e3OffReqDates=new ArrayList<>();
//            e3OffReqDates.add(LocalDate.of(2000,10,30));
//            e3OffReqDates.add(LocalDate.of(2000,11,1));
//            e3OffReqDates.add(LocalDate.of(2000,11,2));
//            e3OffReqDates.add(LocalDate.of(2000,11,3));
//
//          Manager m = new Manager("Ahmad","Ahmadi",impossibleOffReqM, Role.Developer);
//            Manager m = mngRepo.findById(Manager.class,2l);
//          Employee e1 = new Employee("Hossein","Hosseini",Role.Developer,3,m);
//          Employee e2 = new Employee("Hadis","Hadisi",Role.Tester,4,m);
//          Employee e3 = new Employee("Arash","Arashi",Role.Developer,3,m);
//
//
//          mngRepo.save(m);
//          empRepo.save(e1);
//          empRepo.save(e2);
//          empRepo.save(e3);

//            List<Employee> employees = empRepo.findAll();
//            for (Employee e:employees){
//                e.setOffRequestSituation(0);
//                empRepo.save(e);
//            }

//           Employee e2= empRepo.findById(Employee.class,5l);
//            e2.offRequest(e2OffReqDates);
//
//            Employee e3= empRepo.findById(Employee.class,6l);
//            e3.offRequest(e3OffReqDates);
//
//            empRepo.save(e2);
//            empRepo.save(e3);

//            List<Employee> employees = empRepo.findEmployeeByOffRequset(true);
//            for (Employee e :employees){
//                System.out.println(e.toString());
//            }

//            Manager m = mngRepo.findById(Manager.class,2l);
//            List<Employee> e = empRepo.findEmployeeByOffRequsetAndManager(true,m);
//            System.out.println(e.toString());
//            m.answeroffRequests(empRepo);

//            Manager m = mngRepo.findById(Manager.class,2l);
//            m.answeroffRequests(empRepo);
//            System.out.println(m.showYours(empRepo).toString());

        };
    }
}