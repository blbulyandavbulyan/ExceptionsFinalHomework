package org.blbulyandavbulyan.calc.exceptions;

public class InvalidOperandException extends IllegalArgumentException{
    public InvalidOperandException(String s) {
        super(s);
    }
}
