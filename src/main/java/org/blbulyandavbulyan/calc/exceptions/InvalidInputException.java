package org.blbulyandavbulyan.calc.exceptions;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputException(String message) {
        super(message);
    }
}
