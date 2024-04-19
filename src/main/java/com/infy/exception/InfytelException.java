package com.infy.exception;

import java.io.Serial;

public class InfytelException extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;
    public InfytelException(String message) {
        super(message);
    }
}
