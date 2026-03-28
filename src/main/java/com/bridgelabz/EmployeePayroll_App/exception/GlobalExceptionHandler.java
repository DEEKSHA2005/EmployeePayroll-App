package com.bridgelabz.EmployeePayroll_App.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;

@ControllerAdvice
public class GlobalExceptionHandler {

    // 🔥 VALIDATION ERROR HANDLER
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<EmployeePayrollException> handleValidationException(MethodArgumentNotValidException ex) {

        String errorMessage = ex.getBindingResult()
                .getFieldError()
                .getDefaultMessage();

        EmployeePayrollException error = new EmployeePayrollException(
                HttpStatus.BAD_REQUEST.value(),
                errorMessage
        );

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    // 🔥 GENERAL EXCEPTION
    @ExceptionHandler(Exception.class)
    public ResponseEntity<EmployeePayrollException> handleAllException(Exception ex) {

        EmployeePayrollException error = new EmployeePayrollException(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                ex.getMessage()
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}