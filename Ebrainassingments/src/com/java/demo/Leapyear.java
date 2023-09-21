package com.java.demo;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[]args) {
		Scanner lp = new Scanner (System.in);
		System.out.print("Type the year =");
		int x = lp .nextInt();
		if (x%4==0) {
			System.out.println ("leapyear");
		}else {
			System.out.println ("Non leapyear");
		}
	}

}
