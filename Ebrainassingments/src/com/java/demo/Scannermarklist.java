package com.java.demo;

import java.util.Scanner;

public class Scannermarklist {
	
	
	public static void main( String []args) {
		
		Scanner list = new Scanner ( System.in );
		
		      System.out.println("Enter English Mark,Maths mark and science mark");
		
		int englishMark =list.nextInt();
		
		   if(englishMark < 30) {
			   
		     System.out.println("fail");
		  }else {
			
			 System.out.println("pass");
		  }
		   
		
		  int mathsMark = list.nextInt();
		   
		     if(mathsMark < 30) {
		    	 
			   System.out.println("fail");
			}else {
				System.out.println("pass");
			}
					   
		      int scienceMark =list.nextInt(); 
		      	            
		        if(scienceMark < 30) {
				   System.out.println("fail");
				}else {
					System.out.println("pass");
				}
				
		
	 }
	 
	}



