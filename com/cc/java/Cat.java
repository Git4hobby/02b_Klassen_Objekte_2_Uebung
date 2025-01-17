package com.cc.java;

public class Cat {

    String firstName;
    String furcolor;
    int age;

    public Cat(String firstName, String furcolor, int age){
        this.firstName = firstName;
        this.furcolor = furcolor;
        this.age = age;
    }
   




    
    public Cat getInstanceVariable(){
       return this;
    }
    


}
