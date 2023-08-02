package org.blbulyandavbulyan.bank;

import org.blbulyandavbulyan.bank.exceptions.InsufficientFundsException;
import org.blbulyandavbulyan.bank.exceptions.InvalidAmountException;

public class BankAccount {
    private long amount;
    public void topUp(long amount){
        if(amount <= 0)throw new InvalidAmountException("Нельзя пополнить счёт на отрицательную сумму!");
        this.amount+=amount;
    }
    public void withdraw(long amount){
        if(amount <= 0)throw new InvalidAmountException("Нельзя списать отрицательную сумму!");
        if(this.amount < amount)throw new InsufficientFundsException("Недостаточно средств на счете");
        this.amount-=amount;
    }
    public long getAmount() {
        return amount;
    }
}
