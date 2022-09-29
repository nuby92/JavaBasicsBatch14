package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		//We use nextInt() if we want an int type of data from the keyboard
		
		System.out.println("You enter your age"); 
		int age=scanner.nextInt();
		
		
		if (age<18)
		{
			System.out.println("You shuld study"); 
     
	}else {
		System.out.println("You should start working");
	}
	
	
	}
}
