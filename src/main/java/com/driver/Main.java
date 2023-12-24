package com.driver;
public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class RWOnly in this file
        RWOnly obj = new RWOnly();            
        obj.setName("John");  // Task 4: Try setting a value to name by directly accessing it using obj
        System.out.println("Name: " + obj.getName()); // Task 6: Set a value to name using setter function and access it using getter function
    }
}
