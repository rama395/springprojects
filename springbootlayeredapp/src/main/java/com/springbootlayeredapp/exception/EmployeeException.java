package com.springbootlayeredapp.exception;

public class EmployeeException extends RuntimeException
{
    public EmployeeException(Throwable cause) {
        super(cause);
    }

    public EmployeeException(String message, Throwable cause) {
        super(message, cause);
    }
}
