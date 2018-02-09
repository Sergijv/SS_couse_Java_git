package com.company.Task4;

public class Main {

    public static void main(String[] args) {
       //Example
        Student st1 = new Student("Ann", 10);
        Student st2 = new Student("Max", 20);
        Student st3 = new Student("Tony", 30);
        System.out.println("Total rating: " + Student.avgRating);
        System.out.println(st1.getName() + " rating : " + st1.getRating());
        System.out.println(st2.getName() + " rating : " + st2.getRating());
        System.out.println(st3.getName() + " rating : " + st3.getRating());

        //Practical task
        Person p1 = new Person("Ann", 1983);
        Person p2 = new Person("Max", 1973);
        Person p3 = new Person("Doly", 1963);
        Person p4 = new Person("Kate", 1987);
        Person p5 = new Person("Jon", 1986);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

        //Homework
        Employee e1 = new Employee("Jon", 5);
        Employee e2 = new Employee("Ted", 5);
        Employee e3 = new Employee("Andy", 5);


    }



}