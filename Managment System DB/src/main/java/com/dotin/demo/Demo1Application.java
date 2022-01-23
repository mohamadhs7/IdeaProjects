package com.dotin.demo;

import com.dotin.demo.entities.Manager;
import com.dotin.demo.entities.Role;
import com.dotin.demo.repositories.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo1Application {

    @Autowired
    ManagerRepository managerRepo;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
    @Bean
    CommandLineRunner runner() {
        return args -> {
//            Manager m = new Manager(1,"ALi","Alavi", Role.Developer);
//            managerRepo.save(m);
        };
    }
}
