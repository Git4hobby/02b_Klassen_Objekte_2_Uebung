package com.cc.java;

public class Cat {

    private String firstName; //hier sind Objekte der Klasse String zuerwarten
    private String furcolor; 
    private int age;

    public Cat(String firstName, String furcolor, int age){
        this.firstName = firstName;
        this.furcolor = furcolor;
        this.age = age;
    }
   //** Getter **//
    public String getFirstName() {
        return firstName;
    }

    public String getFurcolor() {
        return furcolor;
    }

    public int getAge() {
        return age;
    }





   
    // public Cat getInstanceVariable(){
    //    return this;
    // }
    


}
