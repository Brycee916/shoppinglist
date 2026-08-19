package com.example.shoppinglist.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice //allows it to catch exceptions from any controller in application
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGlobalException(Exception e){
        return new ResponseEntity<>("An unexpected error occurred: " + 
                                    e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
