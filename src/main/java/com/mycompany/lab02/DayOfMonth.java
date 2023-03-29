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
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap thang cua nam: ");
        int month = s.nextInt();
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay!");
                break;
               
            case 2:
                System.out.println("Thang co 31 ngay!");
                break;
                
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay!");
                break;
            default:
                System.out.println("Thang khong hop le");;
        }
    }
}
