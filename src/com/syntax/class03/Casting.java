package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*type casting => type = data type casting= converting
		 * converting one data type to another
		 * we have to use parentcis to convert
		 * we can convert smallest box to lager boxes
		 * larger box to small box -java will complaim so we need to add () to tell java we know the data wil not fot but we want to do it anyway 
		 */
		
		
		byte box1=127; //smallest box 
		short box2=3333; // slightly large box
		int box3=45454545; //large box most commonly used
		long box4=45454545;// slightly large box
		float box5=414564545; //larger box
	    double box6= 45454545;//largest 

		int number=(int)15.2; // we can't store the decimal number in a box of type int
		System.out.println(number);
		
		byte smallestBox= (byte) box2; // larger box to small box -java will complaim so we need to add () to tell java we know the data wil not fot but we want to do it anyway 
		
		System.out.println(smallestBox);
		
		short biggestBox=box1;
		
		long box7=box1; // we can do this because box 7 is larger than box1
		
		// as box6 is larger is double we need to type casting to assing 
		float box8=(float)box6;
		
		char a=(char)67;
		System.out.println(a);
		
		int box9= (int)box4;
		System.out.println(box9);




	}

}
