/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_3_4;

import java.util.Scanner;

/**
 * Read rider height from keyboard and determine if safety threshold has been met.
 * 
 * @author jeff
 */
public class rideHeight {
    public static void main(String[] args) {
        // Declare constants and variables:
        final int MIN_HEIGHT_CM = 80;
        int rider1Height;
        int rider2Height;
        boolean tallEnough;
        Scanner heightMachine = new Scanner(System.in);
        
        // Write a user-friendly prompt to the screen:
        System.out.println ("Welcome to the Thunderbolt!");
        System.out.println ("Riders must be more than " + MIN_HEIGHT_CM + " cm tall to ride, "
                + "and must ride in pairs.");
        System.out.println ("Please type the height of the first hopeful rider in "
                + "centimeters: ");
        // Read an integer from the keyboard:
        rider1Height = heightMachine.nextInt();
        System.out.println ("Please type the height of the second hopeful rider in "
                + "centimeters: ");
        // Read an integer from the keyboard:
        rider2Height = heightMachine.nextInt();
        
        // Compare values to determine rider eligibility:
        tallEnough = (rider1Height > MIN_HEIGHT_CM) && (rider2Height > MIN_HEIGHT_CM);
        if (tallEnough) {
            System.out.print("Your heights of ");
            System.out.print(rider1Height);
            System.out.print(" cm and ");
            System.out.print(rider2Height);
            System.out.print(" cm are greater than the minimum ");
            System.out.print(MIN_HEIGHT_CM);
            System.out.println(" cm!");
            System.out.println("You are both tall enough - enjoy your ride!");
        } else {
            System.out.print("I'm sorry, you both must be taller than ");
            System.out.println(MIN_HEIGHT_CM + " cm to ride.");
            System.out.println("Eat your vegetables, and next year, "
                    + "maybe you can ride!");
        } // close if-else
    } // close main
} // close class
