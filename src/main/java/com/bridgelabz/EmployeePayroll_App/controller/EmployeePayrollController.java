package com.bridgelabz.EmployeePayroll_App.controller;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.EmployeePayroll_App.dto.EmployeeDTO;

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
    public String createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return "Created Employee: " + employeeDTO.getName() +
                " Salary: " + employeeDTO.getSalary();
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody String data) {
        return "Updated Employee: " + data;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return "Deleted Employee with ID: " + id;
    }



}
