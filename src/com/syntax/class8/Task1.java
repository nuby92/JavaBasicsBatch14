package com.syntax.class8;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TASK 1. Print numbers from 1 to 50
		//except those that are divisible by 3
		
		for( int d = 1; d <=50; d++) {
			if (d==3 || d==6 || d==12 || d==15 || d==18 || d==21 || d==24 || d==27 || d==30 ) {
				
				continue;	
			}
			System.out.println(d + " ");
		}
	}

}
