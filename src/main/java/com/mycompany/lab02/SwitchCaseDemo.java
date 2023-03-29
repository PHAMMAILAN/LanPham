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
public class SwitchCaseDemo {
    public static void main(String[]args){
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = s.nextDouble();
        System.out.print("Enter second number: ");
        double b = s.nextDouble();
        System.out.print("Enter a operator: ");
        char c = s.next().charAt(0);
        if (!"+-*/".contains(String.valueOf(c))) {
            System.out.println("Operator is invalid: " + c);
            return;
        }
        double ketQua = calculate(a, b, c);
        
        System.out.println(a + " " + c + " " + b + " = " + ketQua);
    }
    
    static Double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: throw new IllegalArgumentException("Operator is invalid!");
        }
    }
}
