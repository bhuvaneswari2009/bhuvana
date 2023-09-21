package com.java.demo;

public class VariableBook2 {
	
	public static void main (String[]args) {
	
	VariablesBook bookObj1 = new VariablesBook();
	
	VariablesBook bookobj2 = new VariablesBook();
	
	VariablesBook bookobj3 = new VariablesBook();
	
	
	bookObj1.setBookName("science experiments");
	
	bookObj1.setIsbnNumber(200);
	
	bookObj1.setAuthorName("Ravishankar");
	
	bookObj1.setNoOfPages(25);
	
	
	bookobj2.setBookName("Maths experiments");
	
	bookobj2.setIsbnNumber(201);
	
	bookobj2.setAuthorName("Ravi");
	
	bookobj2.setNoOfPages(30);
	
	
	
	bookobj3.setBookName("Simple experiments");
	
	bookobj3.setIsbnNumber(200);
	
	bookobj3.setAuthorName("Ravishankar");
	
	bookobj3.setNoOfPages(25);
	
	
	
	System.out.println("Book name:"+ bookObj1.getBookName()+" Isbn no:"+ bookObj1.getIsbnNumber()+"Author Name"+ bookObj1.getAuthorName()+" No of pages"+ bookObj1.getNoOfPages());
	
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Book name:"+ bookobj2.getBookName()+" Isbn no:"+ bookobj2.getIsbnNumber()+"Author Name"+ bookobj2.getAuthorName()+" No of pages"+ bookobj2.getNoOfPages());
	
	
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	System.out.println("Book name:"+ bookobj3.getBookName()+" Isbn no:"+ bookobj3.getIsbnNumber()+"Author Name"+bookobj3.getAuthorName()+" No of pages"+ bookobj3.getNoOfPages());

	}
	
	}
