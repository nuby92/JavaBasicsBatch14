package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * string concatination helps us combine two Strings together
		 */
		
		String firstName="Mina";
		String lastName="Henen";
		String fullName=firstName+ " " +lastName;
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="NewYork";
		String country="USA";
		String fullAddress= houseNo+"  " +apartmentNo+" "+streetName+" "+city+" " +country;
		System.out.println(fullAddress);
		
		String incompleteAddress=houseNo+city;
		
		String step1="if we subtract 10 from 5 we get="+10; //results in a String 
		//it is nt defined java does not understand what to do when ask her to subtract 
		//a string from sa number it complaims
		//String step2=step1-5;
		
		System.out.println("if we subtract 10 from 5 we get" +(10-5));
		


		
		
		

	}

}
