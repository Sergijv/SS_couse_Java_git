package com.company.Task4;


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
    int age;
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
        age=getRealAge(birthYear);
    }

    public Person() {    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        this.age=year-birthYear;
    }

    public int getRealAge(int birthYear) {
        int age=year-birthYear;
    return age;}

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