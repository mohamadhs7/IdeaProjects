package com.dotin.demo.repositories;

import com.dotin.demo.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

     List<Employee> findEmployeeByOffRequset(Boolean b);

    Employee findById(Class<Employee> employeeClass, long l);
    @Override
    List<Employee> findAll();


}
