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
public class TrungBinhCong {
    
       public static void main(String[] args) {
           // tính TBC các số chia hết cho 3 từ 27 đến 250
           
//        int i = 27;
//        int sum = 0;
//        int dem = 0;
//        
//        while (i <= 250) {
//            if (i % 3 == 0) {
//                sum += i;
//                dem += 1;
//            }
//            i++;
//        }
//        System.out.println("dem = " + dem);
//        System.out.println("sum = " + sum);
//        System.out.printf("TBC la: %.2f %n", (float)sum / dem );

        //Nhap 1 so nguyen duong n nho hon 10 tu ban phim va in ra cac so tu 1 den n
            Scanner s = new Scanner(System.in);
//            int num = -1;
//            do {
//                System.out.print("Enter a number: ");               
//                num = s.nextInt();
//            } while (num < 0 || num >= 10);
//            
//            System.out.println("num = " + num);
            
            // in ra cac so tu 1 den num
//            int i = 1;
//            while(i <= num) {
//                System.out.print(i + ", ");
//                i++;
//            }
//            System.out.println();
//            System.out.println("Bang cuu chuong cua " + num + " la: ");
            //in ra bang cuu chuong cua num
//            for (int j = 1; j <= 10; j++) {
//                System.out.println(num + " * " + j + " = " + num * j);
//           }

            //break demo
            int diem = 0;
            while (true) {    
                System.out.print("Nhap diem: ");           
                diem = s.nextInt();
                if (diem >= 0 && diem <= 10){
                    break;
                }
                 System.out.println("Diem phai tu 0 den 10");
           }
            System.out.println("Diem la: " + diem);
           
    }
}
