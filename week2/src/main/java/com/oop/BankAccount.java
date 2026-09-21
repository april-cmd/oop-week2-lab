package com.oop;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double openingBalance) {
        this.accountHolder = accountHolder;
        this.balance = openingBalance;
    }

    public BankAccount(String accountHolder) {
    this(accountHolder, 0);     // hands off to the constructor above
}
    public BankAccount() {
    // deliberately empty — accountHolder stays null, balance stays 0.0
}
    public void getAccountDetails() {
    System.out.println("Name: " + this.accountHolder + ", Balance: " + this.balance);
}

    public void deposit(double amount) {
    if (amount <= 0) {
        throw new IllegalArgumentException("Deposit must be positive, got: " + amount);
    }
    this.balance += amount;
}
    
    //public void withdraw(double amount) {
        //if (amount > this.balance) {
            //System.out.println("Insufficient funds");
            //return;
        //}
        //this.balance = this.balance - amount;
    //}

    private boolean isValidAmount(double amount) {
    return amount > 0;
}

    public double getBalance() {
    return this.balance;
}
    
}
