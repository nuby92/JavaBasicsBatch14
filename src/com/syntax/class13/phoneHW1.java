package com.syntax.class13;

public class phoneHW1 {

		// TODO Auto-generated method stub
		//Create a Class “Phone”. Create 3 Objects of it: 
			//iPhone, Pixel, Samsung with specific  attributes and behaviors.
 
	  String make;
	  String model;
	  String color;
	  double size;
	  int storage;
	  boolean cheap;
	  
     void takePicture() {
    	 System.out.println("Taking pictures");
     }
        void messeges() {
	System.out.println("Messeging");
}
       public static void main(String[] args) {
    	  Phone iphone=new Phone ();
    	  iphone.make= "Apple";
    	  iphone.model="iphone 12 pro";
    	  iphone.color="gold";
    	  iphone.size=6.8;
    	  iphone.storage=250;
    	  iphone.cheap=false;
    	  
    	  System.out.println("make " + iphone.make + " model " + iphone.model);
    	  iphone.call();
       }
	}


