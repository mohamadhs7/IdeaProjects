package com.example.restfullstarting.resources;

import com.example.restfullstarting.entities.Person;
import com.example.restfullstarting.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "persons")
public class PesonResource {

    @Autowired
    PersonRepository persRepo;

    @GetMapping
    public List<Person> findAllPersons(){
        return persRepo.findAll();
    }

    @GetMapping(value ="/{id}" )
    public Person getById(@PathVariable("id") long id){
           return persRepo.findById(id).get();
        }

    @PostMapping(consumes = "application/json",produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Person addPerson(@RequestBody Person person){
        return persRepo.save(person);
    }

    @PutMapping(value = "/{id}",consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Person update(@RequestBody Person p ){
        return persRepo.save(p);
    }

    @PatchMapping(value = "/{id}",consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public Person partialUpdate(@PathVariable("id") long id  , @RequestBody Person person){

        Person p= persRepo.findById(id).get();
        if (p.getFirstName()!=null) {
            p.setFirstName(person.getFirstName());
        }
        if (p.getLastName()!=null){
            p.setLastName(person.getLastName());
        }
        return persRepo.save(p);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id){
        persRepo.deleteById(id);
    }
}