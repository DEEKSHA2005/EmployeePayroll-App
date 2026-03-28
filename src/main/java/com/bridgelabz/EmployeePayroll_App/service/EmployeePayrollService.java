package com.bridgelabz.EmployeePayroll_App.service;

import com.bridgelabz.EmployeePayroll_App.dto.EmployeeDTO;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.bridgelabz.EmployeePayroll_App.service.IEmployeePayrollService;
import com.bridgelabz.EmployeePayroll_App.repository.EmployeeRepository;
import com.bridgelabz.EmployeePayroll_App.model.Employee;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public String createEmployee(EmployeeDTO employeeDTO) {

        Employee emp = new Employee();
        emp.setName(employeeDTO.getName());
        emp.setSalary(employeeDTO.getSalary());

        repository.save(emp);

        return "Employee saved to DB";
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {

        return repository.findAll()
                .stream()
                .map(emp -> new EmployeeDTO(emp.getName(), emp.getSalary()))
                .toList();
    }
}
