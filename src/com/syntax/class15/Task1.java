package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String and if the String is not empty perform the following: 
			//if the String has an odd number of characters and has 3 or more characters
		//print the character in the middle of the String.
		
	    String str="hello";
	    int length=str.length();
	    if(!str.isEmpty()&&length%2!=0&&length>=3) {

	        int middleIndex=length/2;
	        System.out.println(str.charAt(middleIndex));
	    }
	}
}
