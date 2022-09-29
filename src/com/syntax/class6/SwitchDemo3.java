package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we need to ask a user where he/she is from
		 * base on the country we define favorite food
		 * 
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		String country=in.nextLine();
		
		
		
		String favoriteFood;
		
		switch(country) {
		
		case"Usa":
			favoriteFood="burgers and fries";
			break;
		case"Kazakhstan":
			favoriteFood="beshparmak";
			break;
		case"Turkey":
			favoriteFood="adana";
			break;
		case"Venenzuela":
			favoriteFood="arepa";
			break;
		case"Honduras":
			favoriteFood="pollo con tajadas";
			break;
		case"India":
			favoriteFood="chicken curry";
			break;
		case"Yemen":
			favoriteFood="mandi";
			break;
		case"Afghanistan":
			favoriteFood="Qaboli palow";
			break;
			
		default:
			favoriteFood="Unknown";
		}
		
		
		System.out.println("You are from " +country+ " and your favorite food is " +favoriteFood);
		
	}

}
