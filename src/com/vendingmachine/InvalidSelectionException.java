package com.vendingmachine;

public class InvalidSelectionException extends RuntimeException{
    public InvalidSelectionException(String message) {
        super(message);
    }
}
