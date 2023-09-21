package com.java.demo;

import java.util.Scanner;

public class ScannerAdmission {
 public static void main( String []args) {
	 
	 
	Scanner list = new Scanner ( System.in );
	
	      System.out.println("Enter first year,second year and third year");
	
	int firstYear =list.nextInt();
	   System.out.println("first year = "+ firstYear);
	   
	  int secondYear = list.nextInt();
	   
	   System.out.println("second year = "+ secondYear);
	   
	      int thirdYear =list.nextInt(); 
	      	            
	                  System.out.println("third year = "+ thirdYear);
	                  
	                 
	                  int total=firstYear+secondYear+thirdYear;
	                  System.out.println("total=" +total);
	
 }
 
}

