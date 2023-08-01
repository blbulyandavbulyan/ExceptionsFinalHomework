package org.blbulyandavbulyan.calc.exceptions;

/**
 * Исключение выбрасывается калькулятором, в случае если поступил неверный операнд для данной операции
 */
public class InvalidOperandException extends IllegalArgumentException{
    public InvalidOperandException(String s) {
        super(s);
    }
}
