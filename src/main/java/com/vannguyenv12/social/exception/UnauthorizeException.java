package com.vannguyenv12.social.exception;

public class UnauthorizeException extends RuntimeException {
    public UnauthorizeException() {
        super("Unauthorized! Please Login");
    }
}