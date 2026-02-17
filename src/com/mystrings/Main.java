/**
 *  Java program to reverse the string.
 */
package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a string variable.
        String str = "Solution";
        String reversedString = "";

        // Iterating through str from the end.
        for (int i = str.length() - 1; i >= 0; i--) {

            reversedString += str.charAt(i);

        }

        // Printing reversedString to console.
        System.out.println(reversedString); // Output: noituloS

    }
}