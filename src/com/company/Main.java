package com.company;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposite(20_000.0);
        System.out.println("На вашем счёте: " + bankAccount.getAmount() + " сом.");

        while (true) {
            try {
                bankAccount.withDraw(6_000);
                System.out.println(" -6000.0");
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) e.getRemainingAmount());
                    System.out.println(" -" + e.getRemainingAmount());
                } catch (LimitException ex) {
                    System.out.println(e.getMessage());
                }
                break;
            }

        }
        System.out.println("На вашем счёте: " + bankAccount.getAmount() + " сом.");


    }
}