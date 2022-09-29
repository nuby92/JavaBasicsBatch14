package com.syntax.class9;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] iceCream= {"vanila", "straberry", "pistasho", "kulfi"};
		System.out.println(iceCream[0]);
		System.out.println(iceCream[1]);
		
		//how to take all elements

		for(int i=0; i<iceCream.length; i++) {
			
			System.out.println(iceCream[i]);
		}
	}

}
