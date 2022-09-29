package com.syntax.class03;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * What is type casting? 
		 * Type casting is converting one data type to another data type
		 * Why should I learn about type casting? 
		 * so that we can use the code that is written by someone else to make our life easier 
		 * or when we will be working in teams we will be able to merge the code
		 * What is the syntax for type casting?
		 * When we are converting something smaller to larger we don't do anything.
		 * It happens automatically. We just assign the variable for example. 
		 * 
		 * int box=1234;
		 * 
		 * long box2=box; // this is how it works and it is called implicit or widening automatic 
		 * 
		 * however when we convert a larger data type to smaller data type 
		 * then this is how we do it
		 * 
		 * long box=12345454;
		 * 
		 * int box2=(int)box; narrowing or explicit or manual conversion
		 */
		
		short box=167;
		byte box2=(byte)box;
		System.out.println(box2);

		double money=5;
		boolean isHungry=true;
		double KdcBurger=11;
		
		System.out.println();


	}

}
