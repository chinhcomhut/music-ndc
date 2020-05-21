package com.security.demospringsecurity.error;

public class EmployeeErrorType {
    private String errorMessage;

    public EmployeeErrorType(String errorMessage){
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
