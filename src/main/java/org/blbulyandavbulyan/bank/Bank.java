package org.blbulyandavbulyan.bank;

import org.blbulyandavbulyan.bank.exceptions.InvalidAmountException;

import java.util.HashSet;
import java.util.Set;

public class Bank {
    private final Set<BankAccount> bankAccounts = new HashSet<>();
    public void transferMoney(BankAccount source, BankAccount destination, long amount){
        if(bankAccounts.contains(source) && bankAccounts.contains(destination)){
            if(source == destination)
                throw new IllegalArgumentException("Нельзя переводить деньги самому себе!");
            if(amount <= 0)throw new InvalidAmountException("Некорректная сумма перевода");
            source.withdraw(amount);
            destination.topUp(amount);
        }
        else throw new IllegalArgumentException("Один из счетов в операции не принадлежит данному банку!");
    }
    public void registerAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }
}
