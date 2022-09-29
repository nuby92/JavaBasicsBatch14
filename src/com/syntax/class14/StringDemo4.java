package com.syntax.class14;

public class StringDemo4 {

	public static void main(String[] args) {
		String str="Shah";
		String str2="Shah";
		String str3=new String("Shah");
		
		if(str.equals("Shah")){
			System.out.println("I found it");
		}
		
		//equals check if two String are exactly the same with exact same case
		//equalsIgnoreCase checks if two String are exactly the same but does not care about the
		//case of letters 
		if(str.equalsIgnoreCase("shah")) {
			System.out.println("I found it with equalsIgnoreCase");
			
		}

	}

}
