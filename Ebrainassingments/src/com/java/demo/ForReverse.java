package com.java.demo;

import java.util.Scanner;


public class ForReverse {
	
		public static void main(String[]args) {
			Scanner character = new Scanner (System.in);
			System.out.println("Type name");
			String x = character.nextLine ();
			
			String y = x;
			for(int i = y.length()-1;i>=0;i--) {
			System.out.print(y.charAt(i));
			
			}
			
			
			
		
		}

	}


