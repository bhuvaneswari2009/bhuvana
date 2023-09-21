package com.java.demo;

import java.util.Scanner;

public class Continue {
	
	public static void main(String[]args) {
		Scanner number = new Scanner (System.in);
		
		System.out.print("Enter number =");
		
		int x=number.nextInt();
		
		int i=0;
				do {
					System.out.println(i);					
					 i++;
					
					if(i==5) {
					 i++;
						continue;
					}
					
				}while (i<=x);
	}

}
	

