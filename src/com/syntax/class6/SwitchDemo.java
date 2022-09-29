package com.syntax.class6;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//matching cases must be of the same data type as a veriable
// no duplicate case in switch	
		char choice='Y' ;
		String answer;
		
		switch(choice) {
		case'Y':
			answer="YES";
			break;
		case'N':
			answer="No";
			break;
		case'M':
			answer="Maybe";
			break;
			default:
				answer="Unknown";
		}
		System.out.println(answer);
		
		//LIMITATION OF SWITCH CASE
		
		/*
		 * switch case cannot use logical operators
		 *switch case cannot use relational operators
		 *
		 *
		 *CANNOT WORK WITH BOOLEAN VALUES
		 *
		 *CE: cannot switch on a value of type boolean
		 *boolean(boo)
		 *
		 *
		 *CANNOT WORK FLOAT/DOUBLE AND LONG
		 *
		 *
		 *
		 *
		 *

		 */
	}

}
