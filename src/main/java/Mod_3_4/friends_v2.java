/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_3_4;

import java.util.Scanner;

/**
 *
 * @author jeff
 */
public class friends_v2 {
    
    public static void main(String[] args) {
        // Initialization of variables:
        final String QUESTION1 = "Do you like the outdoors? (1=yes, anything else=no) ";
        final String QUESTION1A = "Do you prefer hiking (1), fishing (2) or just walking(3)? ";
        final String QUESTION2 = "Do you like Linux? (1=yes, anything else=no) ";
        final int COMPAT_SCORE = 100;
        int myScore = 0;
        Scanner scan = new Scanner(System.in);
        int myChoice = 0;
        
       System.out.println("Welcome to Jeff's 'Might We Be Friends' checker.");
        System.out.println("Please answer all questions with a number as appropriate:");
        System.out.println();
        
        // Let's ask question 1 and get a response:
        System.out.print("Question 1: ");
        System.out.println(QUESTION1);
        myChoice = scan.nextInt();

        switch(myChoice) {
            case 1: 
                myScore = myScore + 50;
                System.out.println("Me too!  There's a good chance we can be friends!");
                System.out.println();
                // Let's ask the follow-up question and get a response:
                System.out.print("Question 1a: ");
                System.out.println(QUESTION1A);
                myChoice = scan.nextInt();
                
                switch (myChoice) {
                    case 1:
                        myScore = myScore + 50;
                        System.out.println("I like hiking just fine.");
                        break;
                    case 2:
                        myScore = myScore + 80;
                        System.out.println("I like fishing a lot.");
                        break;
                    case 3:
                        myScore = myScore + 100;
                        System.out.println("I like long walks on the beach.  Weird huh?");
                        break;
                    default: 
                        System.out.println("Invalid input.  This does not help us be friends...");
                }
                break;
            default:
                System.out.println("I don't understand why people don't like the outdoors.");
                myScore = myScore - 10;
        } // end case (QUESTION1)
                
        // Let's ask question 2 and get a response:
        System.out.print("Question 2: ");
        System.out.println(QUESTION2);
        myChoice = scan.nextInt();
        
        switch (myChoice) {
            case 1:
                myScore = myScore - 25;
                System.out.println("I'm a Windows person... this makes it harder for us to be friends.");
            default:
        }
        
        // Let's evaluate the score and print results:
        System.out.println();
        System.out.println("Here are the results:");
        System.out.print("Your score:  ");
        System.out.println(myScore);
        System.out.print("Required score:  ");
        System.out.println(COMPAT_SCORE);
        
        if(myScore >= COMPAT_SCORE) {
            System.out.println("We may have enough in common to be friends!");
        } else {
            System.out.println("We may not have enough in common to be friends.");           
        } // close if.
        System.out.println("These results aren't final - so there is still a chance.");
    } // close psvm.
            
} // close class...
