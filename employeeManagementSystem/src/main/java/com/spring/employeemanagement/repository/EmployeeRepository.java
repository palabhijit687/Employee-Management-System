package com.spring.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.employeemanagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
