# Employee Payroll Application (Spring Boot)

## Overview

This project is a **Spring Boot REST API application** for managing employee payroll data.
It supports **CRUD operations**, **validation**, and **global exception handling** with MySQL database integration.

---

## Features

✔ Create Employee

✔ Get All Employees

✔ Update Employee

✔ Delete Employee

✔ MySQL Database Integration

✔ Input Validation using Jakarta Validation

✔ Global Exception Handling

✔ Clean JSON Error Responses

---

## Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Lombok
* Maven

---

## Project Structure

```
src/main/java/com/bridgelabz/EmployeePayroll_App
│
├── controller
├── service
├── repository
├── model
├── dto
├── exception
└── EmployeePayrollAppApplication
```

---

##  Use Cases

### 🔹 UC1 – Application Setup
Initialize Spring Boot project with required dependencies and basic structure.

### 🔹 UC2 – REST API Controller
Create REST endpoints for handling employee payroll operations.

### 🔹 UC3 – DTO Model
Introduce DTO (Data Transfer Object) for transferring employee data between layers.

### 🔹 UC4 – Service Layer
Implement business logic using service layer to separate concerns.

### 🔹 UC5 – In-Memory Storage
Store employee data temporarily using List before database integration.

### 🔹 UC6 – Lombok Integration
Reduce boilerplate code using Lombok annotations like `@Data`.

### 🔹 UC7 – Logging Implementation
Add logging using SLF4J to track application flow and debug information.

### 🔹 UC8 – Logging Levels
Configure logging levels (INFO, DEBUG, ERROR) using properties file.

### 🔹 UC9 – Database Integration
Connect application with MySQL using Spring Data JPA and persist employee data.

### 🔹 UC10 – Input Validation
Validate employee input using `@NotBlank` and `@Pattern` annotations.

### 🔹 UC11 – Global Exception Handling
Handle exceptions globally using `@RestControllerAdvice`.

### 🔹 UC12 – Custom Exception Handling
Create custom exception for employee not found and return structured error responses.

---

## API Endpoints

### 🔹 Create Employee

**POST** `/employeepayrollservice/create`

```
{
  "name": "Deeksha",
  "salary": 100000
}
```

---

### 🔹 Get All Employees

**GET** `/employeepayrollservice/all`

---

### 🔹 Update Employee

**PUT** `/employeepayrollservice/update/{id}`

```
{
  "name": "Sathya",
  "salary": 70000
}
```

---

### 🔹 Delete Employee

**DELETE** `/employeepayrollservice/delete/{id}`

---

## Validation Rules

* Name must not be empty
* Name must contain only letters
* Minimum 3 characters

---

## Error Handling

Custom error response format:

```
{
  "status": 400,
  "message": "Name cannot be empty",
  "timeStamp": 17123456789
}
```

---

## How to Run

1. Clone the repository
2. Open in IntelliJ
3. Configure MySQL
4. Run:

```
EmployeePayrollAppApplication.java
```

---

## Testing

Use **Postman**:

* Base URL: `http://localhost:8080`
* Test all endpoints using JSON requests

---

