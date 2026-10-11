package com.example.ems_backend.exception;

public class SourceNotFoundException extends RuntimeException{

    public SourceNotFoundException(String message){
        super(message);
    }

}
