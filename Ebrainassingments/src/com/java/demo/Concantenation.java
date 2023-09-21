package com.java.demo;
import java.util.Scanner;
public class Concantenation {
	public static void main (String []args) {
		//String s1,s2;
		Scanner s = new Scanner(System.in);
		System.out.println("type string 1 and string 2");//to type
		
		String x=  s.nextLine(); //variable name declaration
		String y = s.nextLine(); //variable name declaration
		
		String z= x.concat(y); 
		System.out.println("my result is  " + z);//print of concantenation
		s.nextLine();//to give space between the print statement
        
		System.out.print(x.length());// print of length of the x in number
					
		
	}

}
