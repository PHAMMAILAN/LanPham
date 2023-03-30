/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02;


/**
 *
 * @author ngoth
 */
public class Main {    
    
    public static void main(String[] args) {
//        Person p = new Person();
////        int age = p.inputAge();
////        p.isEnlisted(age);
//        p.isEnlisted(p.inputAge());
////        double income = p.inputIncome();
////        p.calIncomeTax(income);
//        p.calIncomeTax(p.inputIncome());
//        p.display();
        
        //kiem tra 1 so la SNT?
        SoNguyenTo i = new SoNguyenTo();
        i.inputNumber();
        if (i.checkSNT()) {
            System.out.println(i.n + " la SNT");
        } else {
            System.out.println(i.n + " khong la SNT");
        }
        
        //in ra a SNT dau tien
        int a = i.n;
        int count = 0;
        i.n = 2;
        System.out.println(a + " SNT dau tien la: ");
        while (count < a) {
            if (i.checkSNT()) {
                System.out.print(i.n + ", ");
                count ++;
            }
            i.n++;
        }
    }
    
}
