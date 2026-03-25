package com.bridgelabz.EmployeePayroll_App.service;

import com.bridgelabz.EmployeePayroll_App.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Override
    public String createEmployee(EmployeeDTO employeeDTO) {
        return "Employee Created: " + employeeDTO.getName() +
                " Salary: " + employeeDTO.getSalary();
    }
}
