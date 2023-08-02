package org.blbulyandavbulyan.bank.exceptions;

public class InsufficientFundsException extends BankException{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
