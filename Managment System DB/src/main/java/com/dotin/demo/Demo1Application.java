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
//            impossibleOffReqM.add(LocalDate.of(2000,10,20));
//            impossibleOffReqM.add(LocalDate.of(2000,10,21));
//            impossibleOffReqM.add(LocalDate.of(2000,10,22));
//
            List<LocalDate> e1OffReqDates=new ArrayList<>();
            e1OffReqDates.add(LocalDate.of(2000,10,22));
            e1OffReqDates.add(LocalDate.of(2000,10,23));
            e1OffReqDates.add(LocalDate.of(2000,10,24));
            e1OffReqDates.add(LocalDate.of(2000,10,25));
////
//            List<LocalDate> e3OffReqDates=new ArrayList<>();
//            e3OffReqDates.add(LocalDate.of(2000,10,17));
//            e3OffReqDates.add(LocalDate.of(2000,10,18));
//            e3OffReqDates.add(LocalDate.of(2000,10,19));
//            e3OffReqDates.add(LocalDate.of(2000,10,20));
//
//          Manager m = new Manager("Ali","Alavi",impossibleOffReqM, Role.Developer);
//            Manager m = mngRepo.findById(Manager.class,1l);
//          Employee e1 = new Employee("Mahnaz","Mahnazi",Role.Developer,3,m);
//          Employee e2 = new Employee("Mahdi","Mahdavi",Role.Tester,4,m);
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

//           Employee e1= empRepo.findById(Employee.class,4l);
//            e1.offRequest(e1OffReqDates);
//            empRepo.save(e1);

//            List<Employee> employees = empRepo.findEmployeeByOffRequset(true);
//            for (Employee e :employees){
//                System.out.println(e.toString());
//            }

            Manager m = mngRepo.findById(Manager.class,1l);
            m.answeroffRequests(empRepo);
        };
    }
}