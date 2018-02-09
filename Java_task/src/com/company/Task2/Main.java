package com.company.Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //LessonTask
        // 1 знак числа
        System.out.println("Введіть число");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=0;
        if      (m>0)  n=1;
        else if (m==0) n=0;
        else if (m<0)  n=-1;
        System.out.println("Результат обрахунку :"+n);
        System.out.println();
        // 2 парність, додатність
        System.out.println("Введіть число");
        int n1 = sc.nextInt();
        if (n1%2==0) System.out.println("Число парне");
        else System.out.println("Число не парне");
        if (n1<0) System.out.println("Число негативне");
        else if (n1>0) System.out.println("Число позитивне");
        System.out.println();
        // 3 сума добуток
        int sum=0,pro=1;
        for (int j=1; j<11;j++ ){
            sum=sum+j;
            pro=pro*j;
        }
        System.out.println("Сума перших 10 чисел "+sum);
        System.out.println("Добуток перших 10 чисел "+pro);
        System.out.println();
        // 4 трикутник
        System.out.println("Вивід трикутника");
        for (int i=0; i<5;i++){
            for (int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Home Work2
            //Task1 about leap year and rewrite it using one condition if together with logical operators.
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Year");
            int year = sc1.nextInt();
            if ((year % 4 != 0)||((year % 400 != 0)&&(year%100==0)))
                System.out.println("Not Leap");

            else  System.out.println("Leap");
            System.out.println();
            //Task2 Write the code to display the pattern like a pyramid using asterisk and each row contain an odd number of asterisks.
            System.out.println("Enter line numder");
            int line=sc1.nextInt();
            for (int i=1; i<line+1; i++) {
                for (int j=0; j<line-i; j++) System.out.print(" ");
                for (int k=0; k<2*i-1; k++)  System.out.print("*");
                System.out.println();
            }
            //Write the code to find the sum of the series 1+11+111+1111 + .. n terms.
            System.out.println("Enter nomber of series:");
            int s = sc1.nextInt();
            int sum1=0,it=0;
            for (int i=0; i<s; i++){
                it=it*10+1;
                sum1=sum1+it;
            }
            System.out.println("Resalt:"+sum1);
        }
    }

