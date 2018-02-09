package com.company.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1
        System.out.println("Введіть радіус:");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double per = 2*Math.PI*r;
        double area = Math.PI*r*r;
        System.out.println("Периметер фігури P="+per);
        System.out.println("Площа фігури S="+area);
        System.out.println();
        //Task 1
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.println("Your name is "+name+",");
        System.out.println("Your are "+age+" years old.");
    }
}