package com.company;

public  class Student {
    private String name;
       public void setName(String name) {
        this.name = name;
    }
       public String getName() { return name;}
       static int count=0;

    private double rating=0;
       public void setRating(double rating) {
           if (avgRating==0){
               //First student
               avgRating=rating;
               this.rating = rating;
           }
           else if (this.rating!=0) {
               // Student exist
               avgRating=avgRating-this.rating/count+rating/count;
               this.rating = rating;
           }
       }
       public double getRating() {  return rating;}

   static double avgRating=0;
       public  double getAvgRating() {
        return avgRating;
    }

   public Student() {   count+=1; }

   public Student(String name, double rating) {
        this.name = name;
        this.rating = rating;
        count +=1;
        avgRating=avgRating+(rating-avgRating)/count;
   }
   public boolean betterStudent(Student st1,Student st2){
           if (st1.rating>st2.rating)return true;
           else return false;
   }

    @Override
    public String toString() {
        return "Sudent{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
