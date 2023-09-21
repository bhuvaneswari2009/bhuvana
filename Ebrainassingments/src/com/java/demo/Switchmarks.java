package com.java.demo;

import java.util.Scanner;

public class Switchmarks {
	
	public static void main (String[]args) {
		
		Scanner x=new Scanner(System.in);
		
		System.out.println("Enter mark");
		
		int mark = x.nextInt();
		
		switch(mark) {
		
		case(10):System.out.println("grade A");break;
		case (30):System.out.println("grade B");break;
		case (40):System.out.println("grade c");break;
		default:System.out.println("reappear");
		}
	}

}
