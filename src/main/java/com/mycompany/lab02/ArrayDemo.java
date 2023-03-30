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
public class ArrayDemo {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4};
//        a[2] = a[1] * 4;
//        for (int i = 0; i < a.length; i++) {
//            
//            System.out.print(a[i] + ", ");
//        }

//        display();
//        display(10, 20, 30);


    //nhập vào 1 mảng và sắp xếp tăng dần
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = s.nextInt();            
        }
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }        
        // sắp xếp
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;                            
                }                
            }            
        }
        System.out.println("\nMang sau khi sap xep tang dan la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }
    
    // var argument
//    static void display(int ... a) {
//        if (a.length == 0) {
//            System.out.println("Khong tham so dau vao");
//        } else {
//            for (int i = 0; i < a.length; i++) {
//                System.out.print(a[i] + ", ");
//                
//            }
//        }
//    }
    
    
    
}
