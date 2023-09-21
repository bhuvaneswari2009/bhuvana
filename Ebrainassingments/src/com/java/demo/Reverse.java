package com.java.demo;

import java.util.Scanner;

public class Reverse {
	

	    public static void main(String[] args) {
	    	
	    	Scanner name = new Scanner (System.in); 
	    	System.out.println("print name");
	    	
	    	String x = name.nextLine();
	    	
	    	
	    	
	        StringBuilder y = new StringBuilder(x);
	        y.reverse();
	        
	        System.out.println(y);
	        
	      
	         name.close();  
	        
	    }
	}



