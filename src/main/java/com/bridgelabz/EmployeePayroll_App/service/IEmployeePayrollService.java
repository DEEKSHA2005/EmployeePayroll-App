package com.bridgelabz.EmployeePayroll_App.service;

import com.bridgelabz.EmployeePayroll_App.dto.EmployeeDTO;
import java.util.List;

public interface IEmployeePayrollService {

    String createEmployee(EmployeeDTO employeeDTO);

    List<EmployeeDTO> getAllEmployees();
}