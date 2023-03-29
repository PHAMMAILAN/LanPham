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
public class EquationOfDegree1 {
    
    private double a;
    private double b;
    
    static Scanner s = new Scanner(System.in);
    public EquationOfDegree1() {
        inputNumber();
    }
    
    private void inputNumber() {
        System.out.print("Enter a = ");
        a = s.nextDouble();
        System.out.print("Enter b = ");
        b = s.nextDouble();
    }
        
    public void solveAnEquationOfDegree1() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinitely solutions!");
            } else {
                System.out.println("No solution!");
            }
        } else {
            System.out.println("x = " + -b/a);
        }
    }
}
