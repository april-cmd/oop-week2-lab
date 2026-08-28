package com.oop;

public class Student {
    public String name;
    public int grade;

    public void updateGrade(int newGrade) {
        this.grade = newGrade;
        if (newGrade < 0 || newGrade > 100) {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
            return;
    }
        }
    }
 

