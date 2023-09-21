package com.java.demo;

import java.util.Scanner;

public class CharAt {
	public static void main(String[]args) {
		Scanner character = new Scanner (System.in);
		System.out.println("Type name");
		String x = character.nextLine ();
		
		String y = x;
		char ch = y.charAt(6);
		System.out.println(ch);
		
		
		
	
	}

}
