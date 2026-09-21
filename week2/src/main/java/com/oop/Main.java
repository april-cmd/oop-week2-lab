package com.oop;

public class Main {
    public static void main(String[] args) {
        BankAccount jacobsAccount = new BankAccount();

        BankAccount b1 = new BankAccount("Jacob", 1000000);
        BankAccount b2 = new BankAccount("Jane");
        BankAccount b3 = new BankAccount();

        b1.getAccountDetails();
        b2.getAccountDetails();
        b3.getAccountDetails();

        try {
        b1.deposit(100);

        System.out.println("Deposited. New balance: " + b1.getBalance());

        } catch (IllegalArgumentException e) {
            System.out.println("Deposit rejected: " + e.getMessage());

        } finally {
            System.out.println("Transaction attempt logged.");
        }

        //jacobsAccount.accountHolder = "Jacob";
        //jacobsAccount.balance = 100;

        //System.out.println("Before deposit: " + jacobsAccount.balance);
        //jacobsAccount.deposit(100);
        //System.out.println("After deposit: " + jacobsAccount.balance);

        jacobsAccount.deposit (500);

        jacobsAccount.getBalance();



    }
}
        

