package com.syntax.class6;

import java.util.Scanner;

public class HWLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  Ask user to enter their country and capture it. 
 *  Once values are captured print which language user speaks.
 */
		Scanner in=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		String country=in.nextLine();
		
		
		
		String language;
		
		switch(country.toLowerCase()) {
			
		case"honduras":
			language="Spanish";
			break;
		case"moldova":
			language="Romanian";
			break;
		case"franch":
			language="franch";
			break;
		case"uSA":
			language="english";
			break;
		default:
			language="Unknown";
		
		}
		System.out.println(language);

		
		
		
		
	}
}


