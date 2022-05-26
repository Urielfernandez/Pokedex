package com.Urielfernandez.Pokedex.controller.exceptions;

import com.Urielfernandez.Pokedex.exceptions.ErrorMessage;
import com.Urielfernandez.Pokedex.exceptions.NoRecordsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Component
public class AppExceptionController {
    @ExceptionHandler(NoRecordsException.class)
    public ResponseEntity<?> handleNoRecordsException(NoRecordsException e){
        return new ResponseEntity<>(new ErrorMessage(e.getMessage()), HttpStatus.NOT_FOUND);
    }
}
