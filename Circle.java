package ca.bcit.comp1510.lab2;

import  java.util.Scanner;

/**
 * This describes the Circle class which will calculate the area and circumference 
 * of a circle based on user input of a radius
 * @author RAU
 * @version 2017
 */
public class Circle {
    /**
     * drives the program
     * @param args
     */
    public static void main(String[] args) {
        final double PI = 3.14159; 
        double       radius; 
        double       circumference; 
        double       area;
        double       doubleTheArea;
        double       doubleTheCircumference;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter radius value");
        
        radius = myScanner.nextDouble();
        circumference = 2 * radius * PI; 
        System.out.println("Circumference: " + circumference);
        area = radius * radius * PI;
        System.out.println("Area: " + area); 
        
        double doubleRadius = radius*2;
        System.out.println("Double The Radius: " + doubleRadius);
        doubleTheArea = doubleRadius * doubleRadius * PI;
        System.out.println("Double Area: " + doubleTheArea);
        doubleTheCircumference = doubleRadius * 2 * PI;
        System.out.println("Double Circumference: " + doubleTheCircumference);
        
        myScanner.close();
        
    }

}
