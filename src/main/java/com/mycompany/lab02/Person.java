/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02;

import java.util.Scanner;

/**
 *
 * @author ngoth
 */
public class Person {
    
    int age;
    double income;
    
    static Scanner s = new Scanner(System.in);
    
    public int inputAge() {
        System.out.print("Input your age: ");
        age = s.nextInt();
        return age;
    }
    
    public boolean isEnlisted (int age) {
        return age >= 18 && age <= 27 ;
    }
    
    public double inputIncome() {
        System.out.print("Input your income: ");
        income = s.nextDouble();
        return income;
    }
    
    public double calIncomeTax(double income) {
        double incomeTax = 0;
        if (income > 30) {
            incomeTax += (income - 30) * 0.2;
            income -= 30;
        }
        if (income >= 15) {
            incomeTax += (income - 15) * 0.15;
            income -= 15;
        }
        if (income > 9) {
            incomeTax += (income - 9) * 0.1;
        }
        
        return incomeTax;
    }
    
    public void display() {
        if (isEnlisted(age)) {
            System.out.println("you are old enough to join the army");
        } else {
            System.out.println("you aren't old enough to join the army");
        }
        
        System.out.println("Your income is: " + income + " million VND");
        System.out.println("Your income tax is " + calIncomeTax(income) + " million VND");
    }
}
