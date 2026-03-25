package com.bridgelabz.EmployeePayroll_App.service;

import com.bridgelabz.EmployeePayroll_App.dto.EmployeeDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.EmployeePayroll_App.service.IEmployeePayrollService;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeeDTO> employeeList = new ArrayList<>();

    @Override
    public String createEmployee(EmployeeDTO employeeDTO) {
        employeeList.add(employeeDTO);
        return "Employee Added: " + employeeDTO.getName() +
                " Salary: " + employeeDTO.getSalary();
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeList;
    }
}
