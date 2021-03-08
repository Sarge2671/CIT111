/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_3_4;

/**
 *
 * @author jeff
 */
public class comparisonOperators {
    public static void main(String[] args) {
        final int PARKING_BAN_SNOW_DEPTH = 3; // in inches
        String sign = "No Parking if snow is deeper than 3 inches!";
        int currentSnowDepth = 4;
        boolean snowBanResult = currentSnowDepth >= PARKING_BAN_SNOW_DEPTH;
        
        System.out.print("Parking ban ");
        if (snowBanResult) {
            System.out.print("IS NOW ");
        } else {
            System.out.print("is not ");
        } // close if
        System.out.println("in effect.");
        
    } // close main
   
} // close class
