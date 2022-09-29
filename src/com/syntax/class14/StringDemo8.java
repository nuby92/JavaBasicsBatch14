package com.syntax.class14;

public class StringDemo8 {

	public static void main(String[] args) {
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
 
 System.out.println(str.replace("good", "Execellent"));
 
 //replace method replaces one String with another in a String 
 //replaceAll it takes a pattern and replace all the characters that patter
 System.out.println(str.replaceAll("[a-z]", "  "));
	}

}
