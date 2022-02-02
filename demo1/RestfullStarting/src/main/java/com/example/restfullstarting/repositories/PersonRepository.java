package com.example.restfullstarting.repositories;

import com.example.restfullstarting.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long> {
    @Override
    public List<Person> findAll();



}
