package com.example.handler;

import com.example.exception.PersonNotFoundException;
import com.example.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(value = PersonNotFoundException.class)
    public ResponseEntity<Error> handle(PersonNotFoundException e) {
        Error error = new Error(e.getClass().getSimpleName(), "ERROR");
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
