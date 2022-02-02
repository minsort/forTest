package com.example.testProject.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler{

    @ExceptionHandler
    @ResponseBody
    public String errorParameters (DataIntegrityViolationException exception){
        return exception.getMessage()+"\n Check the parameters!";
    }

    @ExceptionHandler
    @ResponseBody
    public String typeArgument (MethodArgumentTypeMismatchException exception){
        return exception.getMessage()+"\n -----Before you write something, think!-----";
    }
}