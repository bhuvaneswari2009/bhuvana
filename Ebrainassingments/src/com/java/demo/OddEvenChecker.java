package com.java.demo;
import java.util.Scanner;

public class OddEvenChecker {
	
	

	  		public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a number
	        System.out.print("Enter a number: ");
	        
	        // Read the input from the user
	        int number = scanner.nextInt();
	        
	        

	        // Check if the number is even or odd
	        if (number % 2 == 0) {
	            System.out.println(number + " is an even number.");
	        } else {
	            System.out.println(number + " is an odd number.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}



