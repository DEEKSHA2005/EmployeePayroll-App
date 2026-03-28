package com.bridgelabz.EmployeePayroll_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bridgelabz.EmployeePayroll_App.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}