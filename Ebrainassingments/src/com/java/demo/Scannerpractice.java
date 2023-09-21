package com.java.demo;

import java.util.Scanner;

public class Scannerpractice {
	
	public static void main(String []args) {
		Scanner customer = new Scanner(System.in);//creating object
		
		System.out.println("Type your Name");// type your name
		
		 String name = customer.nextLine(); // receive the data and store as string
		   
		   System.out.println("Type your age ");
		   
			  int age = customer.nextInt();
			//  customer.nextLine();          //if after the int is string,give this 
			  
			  System.out.println("type your email.id");
			  
			  String emailId = customer.nextLine();
			 // customer.nextLine();
			
			   System.out.println("My name is  "+ name); // print the received data
 
				System.out.println("My age is  "+ age);
				
				System.out.println("My emailId is  "+ emailId);
				
				

		
		
	}
}
