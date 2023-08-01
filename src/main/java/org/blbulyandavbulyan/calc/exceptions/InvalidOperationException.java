package org.blbulyandavbulyan.calc.exceptions;

/**
 * Исключение бросается парсером, в случае если ему передали выражение с неверной операцией
 */
public class InvalidOperationException extends InvalidInputException{
    public InvalidOperationException(String message) {
        super(message);
    }
}
