package com.company.Task4;

class Employee {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int rate;
      public int getRate() { return rate;}
      public void setRate(int rate) { this.rate = rate;}

    private int hours=0;
      public int getHours() {return hours;}
      public void setHours(int hours) {
          totalHours=totalHours-this.rate+rate;
          this.hours = hours;
      }

    static int totalHours;
      public static int getTotalHours() {return totalHours;}
     //Maybe dont need
    // public static void setTotalHours(int totalHours) {Employee.totalHours = totalHours;}


   // public Employee() {  }

    public Employee(String name, int rate) {
        this.name = name;
        totalHours=totalHours-this.rate+rate;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public int salary = rate*hours;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + salary +
                '}';
    }
    public void changeRate(int rate){this.rate=rate;}
    public double bonuses(double bonus){return salary*bonus;}
}
