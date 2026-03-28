package com.bridgelabz.EmployeePayroll_App.exception;

public class EmployeePayrollException {

    private int status;
    private String message;
    private long timeStamp;

    public EmployeePayrollException(int status, String message) {
        this.status = status;
        this.message = message;
        this.timeStamp = System.currentTimeMillis();
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }
}