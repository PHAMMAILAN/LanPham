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
        Person p = new Person();
//        int age = p.inputAge();
//        p.isEnlisted(age);
        p.isEnlisted(p.inputAge());
//        double income = p.inputIncome();
//        p.calIncomeTax(income);
        p.calIncomeTax(p.inputIncome());
        p.display();
    }
    
}
