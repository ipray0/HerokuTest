package com.example.ppmtool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProjectIdExcepetion extends RuntimeException {
    public ProjectIdExcepetion(String message) {
        super(message);
    }
}
