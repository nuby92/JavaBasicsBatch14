package com.syntax.class9;

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an array of animals and store 5 elements into it.
		//Using 2 different loops print all elements from the array.
		
String[] animals = {"dog", "cat", "turle", "monkey", "elephant", "tiger"};
		
        for(int i=0; i<animals.length; i++) {
			
			System.out.print(animals[i]+" ");
		}
        System.out.println("*************************");
        
        for(String num:animals) {
			System.out.print(num+" ");
	}

}
}

