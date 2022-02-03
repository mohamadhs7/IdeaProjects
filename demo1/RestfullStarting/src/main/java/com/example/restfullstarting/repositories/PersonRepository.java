package com.example.restfullstarting.repositories;

import com.example.restfullstarting.entities.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(collectionResourceRel = "apipersons",path = "apipersons")
public interface PersonRepository extends PagingAndSortingRepository<Person,Long> {
//    @Override
//    public List<Person> findAll();
}
