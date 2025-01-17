package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        // Instanziierung + Wertezuweisung_1
        Cat cat = new Cat("Paola", "white", 29);
       
        // output("Blick von aussen: " + cat);
        // output("Blick von innen: " + cat.getInstanceVariable());
        
        //*  Werte zuweisen (Manuel oder über Setter Funktion)*//
        
        // Manuelle Werte zuweisung:
        // cat.firstName = "Paola";
        // cat.furcolor = "purpelrain";
        // cat.age = 29;
        
        // Werte zuweisung per Setter Funktion
        cat.setAge(30);
        
        // Werte über Getter ausgeben
        output(cat.getFirstName());
        output(cat.getFurcolor());
        output(Integer.toString(cat.getAge()));  // EXPLIZITE Typenkonvertierung
        
        output("-----------------------");

        // Instanziierung + Wertezuweisung_
        Cat cat2 = new Cat("Pablo", "black", 35);
        // output("Blick von aussen: " + cat2);
        // output("Blick von innen: " + cat2.getInstanceVariable());
        
        //*  Werte zuweisen (Manuel oder über Setter Funktion)*//

        // Manuelle Werte zuweisung2:
        // cat2.firstName = "Pablo";
        // cat2.furcolor = "pink";
        // cat2.age = 26;
        
        // Werte zuweisung per Setter Funktion
        cat2.setAge(42);
        
        // Werte über Getter ausgaben
        output(cat2.getFirstName());
        output(cat2.getFurcolor());
        output(Integer.toString(cat2.getAge())); // EXPLIZITE Typenkonvertierung
    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

