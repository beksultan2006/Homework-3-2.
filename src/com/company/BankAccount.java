package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposite(double sum) {
        this.amount += sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("На вашем счёте недостаточно средств для проведение операции.\nНа вашем счёте: "
                    + getAmount(), getAmount());
        }
        this.amount -= sum;

    }


}
