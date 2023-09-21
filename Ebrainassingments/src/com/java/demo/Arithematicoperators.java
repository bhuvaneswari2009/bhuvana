package com.java.demo;

import java.util.Scanner;

public class Arithematicoperators {
   	  
			  
	public static void main (String [] args ) {
		
		Scanner objx = new Scanner(System.in);
		    
		Scanner objy = new Scanner(System.in);
		
		  
		 System.out.println("Enter x and y ");
		 
		 System.out.println("x =");
		  int x = objx .nextInt(); 

				 
		 System.out.println ("y =");
			
			  
			  int y = objy.nextInt();
			  
			  int z=x+y;
	   
	    System.out. println  ( "z1 = " +  z  );
	    
	    System.out.println   ("z2 = " + (x - y));
	    
	    	    
	    System.out. println  ( "z3 = " + (x*y));
	    
	    System.out. println  ( "z4 = " + (x/y));
	    
	    System.out. println  ( "z5 = " + (x%y));
	    
	    System.out. println  ( "z6 = " + (++x));
	    
	    System.out. println  ( "z7 = " + (--x));
	    
	    
	    
	    
	    
	   
	}
	
}
