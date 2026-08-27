package com.oop;

public class Main {
    static BankAccount jacobsAccount = new BankAccount();
    static BankAccount useAccount = new BankAccount();

    static Student student1 = new Student();
    static Student student2 = new Student();

    public static void main(String[] args) {
        System.out.println(jacobsAccount == useAccount);
    
    jacobsAccount.accountHolder = "Jacob";
    jacobsAccount.balance = 100;

    System.out.println("Before deposit: " + jacobsAccount.balance);
    jacobsAccount.deposit(100);
    System.out.println("After deposit: " + jacobsAccount.balance);
    System.out.println(useAccount.balance);

        System.out.println(student1 == student2);

        student1.name = "Alice";
        student1.grade = 85;

        System.out.println("Before update: " + student1.grade);
        student1.updateGrade(90);
        System.out.println("After update: " + student1.grade);
    }
}