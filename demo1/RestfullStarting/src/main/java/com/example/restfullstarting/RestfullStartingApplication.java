package com.example.restfullstarting;

import com.example.restfullstarting.entities.Person;
import com.example.restfullstarting.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestfullStartingApplication {

    @Autowired
    PersonRepository personRepo;

    public static void main(String[] args) {
        SpringApplication.run(RestfullStartingApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {

//            Person p1 = new Person("ALi","Alavi");
//            Person p2 = new Person("Taghi","Taghavi");
//            Person p3 = new Person("Hossein","Hosseini");
//
//            personRepo.save(p1);
//            personRepo.save(p2);
//            personRepo.save(p3);

        };
    }
}
