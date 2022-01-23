package com.dotin.demo.repositories;

import com.dotin.demo.entities.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends CrudRepository<Manager,Long> {

}
