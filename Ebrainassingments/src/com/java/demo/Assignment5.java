package com.java.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment5 {
	public static void main (String[]args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Type the starting number" );
		int a= number .nextInt();
		System.out.println("Type the ending number" );
		int b= number .nextInt();
		int [] m ={a,b};
		System.out.print("The list of numbers are = ");
		ArrayList<Integer> x =new ArrayList<Integer>(); 

		for(int i=a;i<=b;i++) {

	 x.add(i);
		}
		  System.out.print(x);
		  ArrayList<Integer> evennum =new ArrayList<Integer>(); 

		  ArrayList<Integer> oddnum =new ArrayList<Integer>(); 

		  for(Integer n:x) {
			  
				if(n%2==0) {
					evennum.add(n);
		  }  
				else{
					oddnum.add(n);
				  }
		  
		  		}
		  System.out.println();
		  System.out.println("odd num:"+oddnum);
		  System.out.println("even num:"+evennum);
	}

		
					   
			   
   }
   

	

