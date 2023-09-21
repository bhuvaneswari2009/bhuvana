package com.java.demo;

import java.util.Scanner;

public class ForEvenOdd {
	
	public static void main (String[]args) {
		
		Scanner number = new Scanner (System.in);
		
		System.out.println("type a number ");
				  
		int x = number.nextInt();

			  for(int i = 0;i<=x;i++) {
				    
				  int y = number.nextInt();
				 		
				  
		   		if(y %2 == 0) {				
		   			
					System.out.println(y+"" +"  even");
			
		   		}else{

				    System.out.println(y+"" +" odd ");
			      }
		   		
		       }
	}
}



		