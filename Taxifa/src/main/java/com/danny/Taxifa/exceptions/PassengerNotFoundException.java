package com.danny.taxifa.exceptions;

import lombok.Getter;

@Getter
public class PassengerNotFoundException extends RuntimeException {

    private String message;

    public PassengerNotFoundException(String message) {
        this.message = message;
    }

    public PassengerNotFoundException() {
    }
}
