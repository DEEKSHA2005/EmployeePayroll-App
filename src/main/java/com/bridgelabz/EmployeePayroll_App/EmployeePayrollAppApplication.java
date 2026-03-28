package com.bridgelabz.EmployeePayroll_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class EmployeePayrollAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeePayrollAppApplication.class, args);
    }
}