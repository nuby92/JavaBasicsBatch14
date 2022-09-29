package com.syntax.class7;

public class HomeWorkLook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int  i=20; i>=1; i-=2 ) {
			System.out.println(i + " ");
		}
		System.out.println("*IF cond inside for loop****");
		for(int  i=20; i>=1; i-=2 ) {
			
			if(i%2==0) {
				System.out.println(i);
			}
		}

		
	}

}
