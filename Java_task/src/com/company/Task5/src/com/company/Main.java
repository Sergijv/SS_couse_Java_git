package com.company;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
        public enum Continents {

        Asia, Africa, North_America, South_America, Europe, Antarctica, Australia
        }
        public  enum Department {
        Cleaner, Electrician, Lumber, Builder, Engineer, Architect
        }
     public static void main(String[] args) {
        //HomeWork5
       //1.Enter the name of the country. Print the name of the continent.
       //(Declare enum with names of continents)
        System.out.println("Enter country:");
        Scanner sc = new Scanner(System.in);
        String company = sc.next();
        System.out.println("Your continents is "+Arrays.toString(Continents.values()));
        System.out.println();
        //2. Create an array of ten integers. Display the biggest of these numbers;
        int[] arrey = {12, -5, 56, -763, 456, 567, 43, 61, 234, 731};
        System.out.print("Our array: ");
        for (int i:arrey) {
            System.out.print(i+" ");
        }
        System.out.println();
        int max = arrey[0];
        for (int el : arrey) {
            if (el > max) max = el;
        }
        System.out.println("Maximum:" + max);
        //the sum of positive numbers in the array;
        int sum = 0;
        for (int el : arrey) {
            if (el > 0) sum = sum + el;
        }
        System.out.println("Sum of positive numbers:" + sum);
        //the amount of negative and positive numbers in the array.
        int p_count = 0;
        int n_count = 0;
        for (int el : arrey) {
            if (el > 0) p_count++;
            else if (el < 0) n_count++;
        }
        System.out.println("The amount of negative numbers is " + n_count + " and amount positive numbers is " + p_count);
        //What values there are more: negative or positive?
        if (p_count > n_count) System.out.println("amount of positive values there is more");
        if (p_count < n_count) System.out.println("amount of negative values there is more");
        if (p_count == n_count) System.out.println("amount of positive values = amount of negative values");
         System.out.println();
        //Create array with five objects of class Employee.
         System.out.println("Task Employee");
         Employee[] buildingTeam = new Employee[5];
        buildingTeam[0] = new Employee("Max",Department.Cleaner,1200);
        buildingTeam[1] = new Employee("Jon",Department.Builder,2200);
        buildingTeam[2] = new Employee("Ted",Department.Electrician,2500);
        buildingTeam[3] = new Employee("Andy",Department.Engineer,3200);
        buildingTeam[4] = new Employee("Ken",Department.Lumber,2500);
        //Display all employees of a certain department (enter department name in the console);
        System.out.println("Enter department"+Arrays.toString(Department.values()));
       Scanner s1;
       s1 = new Scanner(System.in);
       String dep = s1.next();
       System.out.println(dep);
       Department depart = Enum.valueOf(Department.class, dep);
       for (Employee e:buildingTeam) {
        if (depart==e.dep) System.out.println(e.toString());
       }
         System.out.println();
         System.out.println("printTeamUp");
        Employee.printTeamUp(buildingTeam);
         System.out.println();
         System.out.println("printTeamDawn");
        Employee.printTeamDown(buildingTeam);
     }
        static class Employee {

            private String name;
            private Department dep;
            private int solary;

            public Employee(String name, Department dep, int solary) {
                this.name = name;
                this.dep = dep;
                this.solary = solary;
            }

            @Override
            public String toString() {
                return "Employee{" +
                        "name='" + name + '\'' +
                        ", dep=" + dep +
                        ", solary=" + solary +
                        '}';
            }

            static public void printTeamUp(Employee[] buildingTeam) {
                for (int i = 0; i < buildingTeam.length - 1; i++) {
                    for (int j = i + 1; j < buildingTeam.length; j++) {
                        if (buildingTeam[i].solary > buildingTeam[j].solary) {
                            Employee tmp = buildingTeam[i];
                            buildingTeam[i] = buildingTeam[j];
                            buildingTeam[j] = tmp;
                        }
                    }

                }
                for (Employee e : buildingTeam) {
                    System.out.println(e.toString());
                }

            }
            static public void printTeamDown(Employee[] buildingTeam) {
                for (int i = 0; i < buildingTeam.length - 1; i++) {
                    for (int j = i + 1; j < buildingTeam.length; j++) {
                        if (buildingTeam[i].solary < buildingTeam[j].solary) {
                            Employee tmp = buildingTeam[i];
                            buildingTeam[i] = buildingTeam[j];
                            buildingTeam[j] = tmp;
                        }
                    }

                }
                for (Employee e : buildingTeam) {
                    System.out.println(e.toString());
                }

            }
        }
     }


