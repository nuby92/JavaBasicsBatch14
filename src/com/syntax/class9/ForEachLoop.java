package com.syntax.class9;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers={12,56,345,1,0,9};
		
		//get all elements using regular for loop
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		for(int num:numbers) {
			System.out.print(num+" ");
		}
		
	}

}
