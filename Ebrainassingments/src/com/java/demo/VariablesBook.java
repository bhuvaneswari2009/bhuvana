package com.java.demo;

public class VariablesBook {
	
	private String bookName;//normal variable
	
    private Integer isbnNumber;//normal variable
	
	private String authorName;//normal variable
	
	private Integer noOfPages;//normal variable
	
	private static String publicationName = "vaibhav Publications"; //static variable
	
	private final static Integer year = 2009; //final static

		
	public String getBookName() {           //normal variable
		return bookName;
	}

	public void setBookName(String bookName) { 
		this.bookName = bookName;
	}

	public Integer getIsbnNumber() {          //normal variable
		return isbnNumber;
	}

	public void setIsbnNumber(Integer isbnNumber) { 
		this.isbnNumber = isbnNumber;
	}

	public String getAuthorName() {           //normal variable
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Integer getNoOfPages() {           //normal variable
		return noOfPages;
	}

	public void setNoOfPages(Integer noOfPages) {
		this.noOfPages = noOfPages;
	}
	

	public static String getPublicationName() {        //static variable
		return publicationName;
	}

	public static void setPublicationName(String publicationName) {
		VariablesBook.publicationName = publicationName;
	}

	public static Integer getYear() {                  //final static variable
		return year;
	}
	
	public static void main (String[]args) {           //main method
		
		VariablesBook bookObj1 = new VariablesBook();                    //object 1 created
		
		VariablesBook bookobj2 = new VariablesBook();                    //object 2 created
		
		VariablesBook bookobj3 = new VariablesBook();                     //object 3 created
		
		//set method  to set values of variables for object 1
		
		bookObj1.setBookName("science experiments");     
		
		bookObj1.setIsbnNumber(200);
		
		bookObj1.setAuthorName("Ravishankar");
		
		bookObj1.setNoOfPages(25);
		
		//set method  to set values of variables for object 2
		
		
		bookobj2.setBookName("Maths experiments");
		
		bookobj2.setIsbnNumber(201);
		
		bookobj2.setAuthorName("Ravi");
		
		bookobj2.setNoOfPages(30);
		
		
		//set method  to set values of variables for object 3
		
		
		
		
		//used get method to get the value and print
		
		
		
		System.out.println("Book name :"+ bookObj1.getBookName()+" Isbn no :"+ bookObj1.getIsbnNumber()+"Author Name :"+ bookObj1.getAuthorName()+" No of pages - "+ bookObj1.getNoOfPages()+","+publicationName +"," + year);
		

		System.out.println("Book name :"+ bookobj2.getBookName()+" Isbn no :"+ bookobj2.getIsbnNumber()+"Author Name :"+ bookobj2.getAuthorName()+" No of pages - "+ bookobj2.getNoOfPages()+","+publicationName +"," + year);
		
		
		System.out.println("      >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>       ");

		System.out.println("Book name :"+ bookobj3.getBookName()+" Isbn no :"+ bookobj3.getIsbnNumber()+"Author Name :"+bookobj3.getAuthorName()+" No of pages - "+ bookobj3.getNoOfPages()+publicationName +"," + year);

		}

	
	}
