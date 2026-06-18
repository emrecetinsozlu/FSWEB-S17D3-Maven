package com.workintech.zoo.exceptions;


import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


public class ZooException extends RuntimeException {
    @Getter
    @Setter
    private HttpStatus httpStatus;
    public ZooException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;

    }
}
