package com.example.employeemanager.repository;

import com.example.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    /*
    Instead of returning Employee we need to return an Optional, because there is a situation where we might not have
    that employee (e.g. someone passes some random id number and there's no Employee but only id number)
     */
    Optional<Employee> findEmployeeById(Long id);
}
