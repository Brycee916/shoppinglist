package com.example.shoppinglist.exceptions;


//handles invalid requests with custom error messages
public class BadRequestException extends RuntimeException{
    public BadRequestException(String message){
        super(message);
    }
}
