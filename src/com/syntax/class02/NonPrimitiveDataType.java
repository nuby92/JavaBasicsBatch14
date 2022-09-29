package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Asma";
		String address="123 address street";
		
		int phone= 123-456-7890;
		
	    String age ="17"; //anything you put inside "" -> become string
	    String character="A";
	    
	    System.out.println(name);
	    
	    //"My name is "+Asma
	    System.out.println("My name is "+ name);
	    
	    //Asma is 17
	    System.out.println(name    + " is " +   age);
	    
	    String fruit ="apple";
	    double price=1.99;
	    //the price of the apple is 1.99
	    
	    System.out.println("The price of the "   +   fruit  +  "  is "  +  price);	
	    
	    fruit="mago";
	    price=5.99;
	    
	    System.out.println("The price of the "   +   fruit  +  "  is "  +  price);	

	    
	    //to attach any value (int, doble, boolean, char, string etc
	    // to a string we use + 
	    // + next to the string acts as concatenation 

	}

}
