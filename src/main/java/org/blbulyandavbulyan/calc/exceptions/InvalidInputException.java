package org.blbulyandavbulyan.calc.exceptions;

public class InvalidInputException extends RuntimeException{
    private boolean hasCause;

    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
        if(cause != null)hasCause = true;
    }

    public InvalidInputException(String message) {
        super(message);
    }
    public boolean hasCause(){
        return hasCause;
    }
}
