package com.oop;

public class Main {
    static BankAccount jacobsAccount = new BankAccount();
    static BankAccount useAccount = new BankAccount();
    public static void main(String[] args) {
        System.out.println(jacobsAccount == useAccount);
    
    jacobsAccount.accountHolder = "Jacob";
    jacobsAccount.balance = 100;

    System.out.println("Before deposit: " + jacobsAccount.balance);
    jacobsAccount.deposit(100);
    System.out.println("After deposit: " + jacobsAccount.balance);
    System.out.println(useAccount.balance);
    }
}