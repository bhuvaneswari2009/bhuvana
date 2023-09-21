package com.java.demo;

import java.util.Scanner;

public class Assignment4 {
	
	public static void main (String[]args) {
	
	Scanner number = new Scanner(System.in);
	
	System.out.println("Type the starting number" );
	int a= number .nextInt();
	System.out.println("Type the ending number" );
	int b= number .nextInt();
	int [] m ={a,b};
	System.out.print("the list of numbers are = ");
	System.out.print("[");
	for (int i = a; i <= b; i++) {
		  System.out.print(i+ " ");
		}
	System.out.println("]");

			
	int smallest = m[0];
	int largest = m[0];
	for (int i = 1; i < m.length; i++) {
		 if(m[i] > largest) {
			 
		    largest = m[i];
		 }else if (m[i] < smallest) {
		    smallest = m[i];
	}
		 }
	
		System.out.println("The largest value is = "+ largest);
		System.out.println("The smallest value is = "+ smallest);

		  
		for (int i = a; i <= b; i++) {
		   if (i % 2 == 0) {
			   
		
		    System.out.println(i+" even");}
		   else {
		    System.out.println(i+" odd");
		  

		}

	  }
		
	}	

}
