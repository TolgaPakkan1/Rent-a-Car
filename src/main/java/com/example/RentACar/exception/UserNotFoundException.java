// Author: Tolga Pakkan

package com.example.RentACar.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
