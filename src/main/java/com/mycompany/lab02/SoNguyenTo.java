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
public class SoNguyenTo {
    
    int n;

//    public SoNguyenTo() {
//        inputNumber();
//    }    
    
    public int inputNumber() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen: ");
        n = s.nextInt();
        return n;
    }
    
    public boolean checkSNT() {
        if (n < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
    
