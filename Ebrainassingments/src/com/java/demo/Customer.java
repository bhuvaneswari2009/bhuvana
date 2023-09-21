package com.java.demo;

public class Customer {
	public String customerName;
	public  Integer customerId;
	public String customerMailid;
	public Long customerCellno;
	public static String companyName;
	public final static String location ="Thanjai"; 
	 
	public static void main(String[]args) {
		Customer customerObj1  = new Customer();
		customerObj1.customerName = "raja";
		customerObj1.customerId   = 001;
		customerObj1.customerMailid = "bkamalakannan777@gmail.com";
		customerObj1.customerCellno = 9245177754l;
		Customer.companyName = "mahindra";
		
		Customer customerObj2 = new Customer();
		customerObj2.customerName = "roja";
		customerObj2.customerId = 002;
		customerObj2.customerMailid = "roja27@gmail.com";
		customerObj2.customerCellno = 6383644879l;
		Customer.companyName = "mahindra";
		
		
		
		Customer customerObj3 = new Customer();
		customerObj3.customerName = "raju";
		customerObj3.customerId = 003;
		customerObj3.customerMailid = "raju27@gmail.com";
		customerObj3.customerCellno = 6383544879l;
		Customer.companyName = "mahindra";
		
		
	String rajaDetails = customerObj1. customerName+","+ customerObj1.customerId+"," +customerObj1. customerMailid+","+customerObj1.customerCellno+","+companyName+","+location;
	String rojaDetails = customerObj2. customerName+","+ customerObj2.customerId+"," +customerObj2. customerMailid+","+customerObj2.customerCellno+","+companyName+","+location;
	String rajuDetails = customerObj3. customerName+","+ customerObj3.customerId+"," +customerObj3. customerMailid+","+customerObj3.customerCellno+","+companyName+","+location;
		
	     System.out.println(rajaDetails);
		 System.out.println(rojaDetails);
         System.out.println(rajuDetails);

			
		}
	}
		
		         
		      
	   
	
