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
   //** Getter (Lesen Werte)**//
    public String getFirstName() {
        if (getPermission()){
            return firstName;
        }else {
            return "YOU HAVE NO PROMISSION";  
        }
       
    }

    public String getFurcolor() {
        return furcolor;
    }

    public int getAge() {
        return age;
    }

    //** Setter (Setzen Werte von außen) */
    public void setAge(int age) {
        this.age = age;
    }





   
    public Cat getInstanceVariable(){
       return this;
    }
    
    private boolean getPermission(){
        return true;
        // return false;
    }


}
