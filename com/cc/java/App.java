package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        // Instanziierung + Wertezuweisung_1
        Cat cat = new Cat("Paola", "Orange", 29);
       
        // output("Blick von aussen: " + cat);
        // output("Blick von innen: " + cat.getInstanceVariable());
        
        // Werte zuweisen
        // cat.firstName = "Paola";
        // cat.furcolor = "Orange";
        // cat.age = 29;

        // Werte ausgeben
        output(cat.firstName);
        output(cat.furcolor);
        output(Integer.toString(cat.age));  // EXPLIZITE Typenkonvertierung
        
        output("-----------------------");

        // Instanziierung + Wertezuweisung_
        Cat cat2 = new Cat("Pablo", "black", 26);
        // output("Blick von aussen: " + cat2);
        // output("Blick von innen: " + cat2.getInstanceVariable());
        
        // Werte zuweisung
        // cat2.firstName = "Pablo";
        // cat2.furcolor = "black";
        // cat2.age = 26;
        
        // Werte ausgaben
        output(cat2.firstName);
        output(cat2.furcolor);
        output(Integer.toString(cat2.age)); // EXPLIZITE Typenkonvertierung
    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

