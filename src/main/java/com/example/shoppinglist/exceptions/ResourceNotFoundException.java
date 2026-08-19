package com.example.shoppinglist.exceptions;


//handles cases where request resources are missing
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }
}
