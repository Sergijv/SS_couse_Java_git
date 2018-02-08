package com.company;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

class Person {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    Date date = new Date();
    int year = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(date)).getYear();

    private int birthYear;
    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    // next line always birthYear=0 why?
    private int age=year-birthYear;
    public Person() {    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthYear=" + birthYear +
                ", age=" + age +
                '}';
    }

    public void info() {
        System.out.println(toString());
    }

}