package com.syntax.class13;

public class Dog {

		// TODO Auto-generated method stub
		//state 
		//attributes/properties/fields
		String name;
		String color;
		String breed;
		double weight;
		int age; 
		//These are behaviours of a dog
		// Methods functions
  void bark () {
	  System.out.println("Barking.............");
	  
  }
  void sleep () {
	  System.out.println("Dog is sleeping");
  }
public static void main(String[] args) {
	//creating objects from class
	//new Dog();=> it creates an object from a class
	Dog dog1=new Dog();
	//calling a behaviour an object 
	dog1.bark();
	dog1.sleep();

}
  
	}


