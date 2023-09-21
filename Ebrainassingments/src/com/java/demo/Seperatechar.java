package com.java.demo;

import java.util.Scanner;

public class Seperatechar {
	public static void main (String []args) {
		Scanner alphabets =new Scanner(System.in);
		
		System.out.println("type alphabets");
		
		String s=alphabets.nextLine();
		
		char x[]  = s.toCharArray();
		System.out.println(x);
	      System.out.println("Size of char is: " + x.length); 

	}

}
