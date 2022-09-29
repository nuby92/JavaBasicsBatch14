package com.syntax.class14;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I love java";
		
		System.out.println(str);
		//Removed the spaces before and after 
		//String but not the ones which are present in between
		System.out.println(str.trim());
		
		//startWith=> checks if String starts with a specific letter or word
		//endWith=>checks if a String Ends with a specific letter or word 
		//contains=> checks if a String contains a specific letter or word 
		
		String str2="Java is Very easy";
		System.out.println(str2.startsWith("J"));
		System.out.println(str2.endsWith("y"));
		System.out.println(str2.toLowerCase().contains("very"));



	}

}
