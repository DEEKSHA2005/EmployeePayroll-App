package com.bridgelabz.EmployeePayroll_App.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double salary;
}
