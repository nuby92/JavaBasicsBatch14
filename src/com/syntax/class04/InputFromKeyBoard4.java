package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard4 {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Did you solve any Repls Assingments please enter true or false");
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if (solvedAnyRepls)
		{
			System.out.println("How many Repls you solved ");
			
			int noOIfReplsSolved=scanner.nextInt();
			
			if(noOIfReplsSolved>=17)
			{
				System.out.println("You are doing great");
			}
			else if(noOIfReplsSolved>=10)
			{
				System.out.println("You are doing okay Please complete them as soon as possible"); 
				
		}else
		{
			System.out.println(" You should solved some more Repls");
		}
		
		}else
		{
			System.out.println("They are very important to learn java please solve them");
		}
			
		
	}}

