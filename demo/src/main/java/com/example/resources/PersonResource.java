package com.example.resources;

import com.example.exception.PersonNotFoundException;
import com.example.model.Person;
import com.example.model.SavePersonRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/persons") //consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class PersonResource {

    private long counter = 0L;
    private final List<Person> internalRepo = new ArrayList<>();

    @PostConstruct
    public void init() {
        internalRepo.add(new Person(++counter, "Ali", "Alavi"));
        internalRepo.add(new Person(++counter, "Hassan", "Hassani"));
        internalRepo.add(new Person(++counter, "Hossein", "Hosseini"));
    }

    @GetMapping
    public ResponseEntity<List<Person>> getAll() {
        return new ResponseEntity<>(
                internalRepo,
                HttpStatus.OK
        );
    }

    @GetMapping(value = "/{personId}")
    public ResponseEntity<Person> get(@PathVariable long personId) throws Exception {
        for (Person person : internalRepo) {
            if (person.getId() == personId) {
                return new ResponseEntity<>(person, HttpStatus.OK);
            }
        }

        throw new PersonNotFoundException();
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody SavePersonRequest savePersonRequest) {
        Person person = new Person(
                ++counter,
                savePersonRequest.getFirstName(),
                savePersonRequest.getLastName()
        );

        internalRepo.add(person);
        return new ResponseEntity<>(person, HttpStatus.OK);
    }

   // @PutMapping


    // get    /persons getAll
    // get    /persons/1 getPersonWithId1
    // post   /persons save
    // put    /persons update
    // delete /persons/1 deletePersonWithId1

    //Swagger
    //Spring Security
}


