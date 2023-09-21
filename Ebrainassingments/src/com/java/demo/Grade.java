package com.java.demo;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[]args) {
		
		Integer englishMark;
		Integer mathsMark;
		Integer scienceMark;
		
		Scanner nila = new Scanner ( System.in );
		
		   System.out.println("Enter English mark ,maths mark and science mark of nila");
		  
		      System.out.println("English mark");		   		   
		         int e1 =nila.nextInt();
		      
		      
		      System.out.println("Maths Mark");
		        int m1 = nila.nextInt();
		       
		       System.out.println("Science Mark ");
		         int s1 =nila.nextInt(); 
		      	 
		      	 
		      	 int totalA=(e1+m1+s1);		      	                  
                 System.out.println("Total = "+totalA);
                 
                 if(totalA <= 10) {
               	  System.out.println("Grade 'C'");               	  
                 }else if (totalA <= 20){
               	  System.out.println("Grade 'B'");
                 }else if (totalA <= 30){
               	  System.out.println("Grade 'A'");
                 }else {
               	  System.out.println("ReAppear");
               	  
                 }
               
		      	 
		      	 
		      	 
		
		      	Scanner sheela = new Scanner ( System.in );
				
				   System.out.println("Enter English mark ,maths mark and science mark 0f sheela ");
				   
				   System.out.println("English mark ");
				    int e2 = sheela.nextInt();
				      
				      System.out.println("Maths Mark");
				   
				    int m2 = sheela.nextInt();
				   
				       System.out.println("Science Mark");
				      int s2 = sheela.nextInt(); 
				      	 
				      	 
				      	int totalB=(e2+m2+s2);
		                  
		                 System.out.println("Total = "+totalB);

		                  
		                  if(totalB <= 10) {
		                	  System.out.println("Grade 'C'");
		                	  
		                  }else if (totalB <= 20){
		                	  System.out.println("Grade 'B'");
		                  }else if (totalB <= 30){
		                	  System.out.println("Grade 'A'");
		                  }else {
		                	  System.out.println("ReAppear");
		                	  
		                  }
		                
				
				      	Scanner maala = new Scanner ( System.in );
						
						   System.out.println("Enter English mark ,maths mark and science mark 0f Maala ");
						   
						   System.out.println("English mark  ");						   
						      int e3 = maala.nextInt();
						      
						      System.out.println("Maths Mark ");						   
						        int m3= maala.nextInt();
						       
						       System.out.println("Science Mark ");						   
						          int s3 = maala.nextInt(); 
		
				                  
		                 
		                   
		                  int totalC=(e3+m3+s3);
		                  System.out.println("Total = "+totalC);

		                  
		                  if(totalC <= 10) {
		                	  System.out.println("Grade 'C'");
		                	  
		                  }else if (totalC <= 20){
		                	  System.out.println("Grade 'B'");
		                  }else if (totalC <= 30){
		                	  System.out.println("Grade 'A'");
		                  }else {
		                	  System.out.println("ReAppear");
		                	  
		                  }
		                  
		                 
		
		
	}

}
