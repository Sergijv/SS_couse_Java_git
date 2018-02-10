package com.company.Task1

import java.util.Scanner;

public class Main {
    public enum Continents {

        Asia, Africa, North America, South America, Europe, Antarctica, Australia
        }
    public static void main(String[] args) {
 //HomeWork5
 /*1.Enter the name of the country. Print the name of the continent.
  (Declare enum with names of continents)
        System.out.println("Enter country:");
        Scanner sc = new Scanner(System.in);
   */
 //2. Create an array of ten integers. Display the biggest of these numbers;
       int[] arrey = {12,-5,56,-763,456,567,43,61,234,731}
       int max=arrey[0];
       for (int el:arrey) {
            if (el>max) max=el;
        }
        System.out.println("Maximum:"+max);
   //the sum of positive numbers in the array;
        int sum=0;
        for (int el:arrey) {
            if (el>0) sum=sum+el;
        }
        System.out.println("Sum of positive numbers:"+sum);
   //the amount of negative and positive numbers in the array.
        int p_count=0;
        int n_count=0;
        for (int el:arrey) {
            if (el>0) p_count++;
            else if (el<0) n_count++;
        }
        System.out.println("The amount of negative numbers is"+n_count+" and amount positive numbers is "+p_count);
        //What values there are more: negative or positive?
        if (p_count>n_count) System.out.println("amount of positive values there is more");
        if (p_count<n_count) System.out.println("amount of negative values there is more");
        if (p_count==n_count) System.out.println("amount of positive values = amount of negative values");
   //Create a class Employee with fields name, department,
Employee[] buildingTeam  = new Employee[5];
buildingTeam[0]=Employee("Max", Cleaner, 3200);


    }

class Employee {
    public enum Department {Cleaner, Electrician, Lumber, Builder, Engineer, Architect}
    private String name;
    private Department dep;
    private int solary;

    static public Employee(String name, com.company.Task1.Employee.Department dep, int solary) {
        this.name = name;
        this.dep = dep;
        this.solary = solary;
    }
}
