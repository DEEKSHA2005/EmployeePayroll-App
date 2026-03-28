package com.bridgelabz.EmployeePayroll_App.controller;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.EmployeePayroll_App.dto.EmployeeDTO;
import com.bridgelabz.EmployeePayroll_App.service.IEmployeePayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import jakarta.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

    @GetMapping("/")
    public String getAll() {
        return "Employee Payroll App - GET call successful";
    }

    @GetMapping("/get/{id}")
    public String getEmployee(@PathVariable int id) {
        return "Employee details for ID: " + id;
    }

    @PostMapping("/create")
    public String createEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {

        log.info("Received request to create employee: {}", employeeDTO);
        log.debug("Debugging employee creation");

        return employeePayrollService.createEmployee(employeeDTO);
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id,
                                 @Valid @RequestBody EmployeeDTO employeeDTO) {

        return employeePayrollService.updateEmployee(id, employeeDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Deleted Employee with ID: " + id;
    }

    @Autowired
    private IEmployeePayrollService employeePayrollService;

    @GetMapping("/all")
    public List<EmployeeDTO> getAllEmployees() {

        log.info("Fetching all employees");

        return employeePayrollService.getAllEmployees();
    }

}
