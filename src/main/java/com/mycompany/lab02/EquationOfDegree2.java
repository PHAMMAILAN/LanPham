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
public class EquationOfDegree2 {
    private double a;
    private double b;
    private double c;
    
    static Scanner s = new Scanner(System.in);
    
    public EquationOfDegree2() {
        inputNumber();
    }
    
    private void inputNumber() {
        System.out.print("Enter a = ");
        a = s.nextDouble();
        System.out.print("Enter b = ");
        b = s.nextDouble();
        System.out.print("Enter c = ");
        c = s.nextDouble();
    }
    
    public double calDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
    
    
    public void solveAnEquationOfDegree2 () {
        double delta = calDelta(a, b, c);
        
        if (delta < 0) {
            System.out.println("No solution");
        } else if (delta == 0){
            System.out.println("x = " + -b/2*a);
        } else {
            System.out.println("Equation have two solutions");
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / 2 * a);
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / 2 * a);
        }
    }
    
    
}
