package com.java.demo;

import java.util.Scanner;

public class Dowhileloop {
	
	public static void main(String []args) {
		
		Scanner number = new Scanner (System.in);//use scanner created object
		
		System.out.println("Type the number"); // type what you need
		int x= number.nextInt(); // store the value as x
		   int i=0 ; //starting value
		 do  {
			 System.out.println(i); // print i
			 i++; //increment is to add 1 number with end no
			 
			 if(i==5) { // where to break
				 break;
			 }
		 } while(i<=x ); // what is the end no
		
	}

}
