package com.java.demo;

import java.util.Scanner;

public class ExceptionalDH {
	
	public static void main (String[]args){
		Scanner object1=new Scanner(System.in);
		System.out.println("Type a number");
		
 int a= object1.nextInt();
 int b= object1.nextInt();
 int c= object1.nextInt();
 String object2;
 try {

	 c = a/b;
     if(c==0)
    	 throw new Exception ("I want print zero");
	}
catch (Exception e){
	System.err.println("error occured");
}
 finally {
	 System.out.println("print the number");

}
 System.out.println(c);
 System.out.println("End of program");

}
	
	
	
	
	
	
	
		

}
