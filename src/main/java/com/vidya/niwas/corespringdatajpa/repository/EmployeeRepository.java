package com.vidya.niwas.corespringdatajpa.repository;

import com.vidya.niwas.corespringdatajpa.data.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findEmployeeByLastNameContaining(String lastname);
}
