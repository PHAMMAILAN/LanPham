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
public class MenuDemo {
    
    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------MENU----------------");
            System.out.println("1. Solve an equation of degree 1.");
            System.out.println("2. Solve an equation of degree 2.");
            System.out.println("3. Finish.");
            System.out.println("-----------------------------------");
            System.out.print("Enter an option: ");
            int op = s.nextInt();
            switch (op) {
                case 1:
                    EquationOfDegree1 e1 = new EquationOfDegree1();
                    e1.solveAnEquationOfDegree1();
                    break;
                case 2:
                    EquationOfDegree2 e2 = new EquationOfDegree2();
                    e2.solveAnEquationOfDegree2();
                    break;
                case 3:
                    return;
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    
}
