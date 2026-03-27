package com.springboot.employeepayroll.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.MethodArgumentNotValidException;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Handle validation errors
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleValidationException(MethodArgumentNotValidException ex) {

        return ex.getBindingResult()
                .getFieldError()
                .getDefaultMessage();
    }

    // Handle custom exceptions
    @ExceptionHandler(EmployeePayrollException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleCustomException(EmployeePayrollException ex) {
        return ex.getMessage();
    }
}