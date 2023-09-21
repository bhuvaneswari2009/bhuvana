package com.java.demo;
import java.util.ArrayList; // import the ArrayList class
	

public class Arrarylist {
	public static void main (String [] args) {

		ArrayList<String> bike= new ArrayList  <String>();
	
	bike .add ("pulsar");
	bike .add ("bmw");
	bike .add ("royal enfield");
	bike .set  (2,"honda");
	bike .remove(1);
     System.out.println(bike.get(0));
     System.out.println(bike);
     //System.out.println(bike.get(2));
     System.out.println(bike.size());


}
}