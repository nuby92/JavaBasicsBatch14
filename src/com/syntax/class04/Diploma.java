package com.syntax.class04;

import java.util.Scanner;

public class Diploma {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
	System.out.println("Do you have a diploma ? true or false");
	
	boolean degree=scanner.nextBoolean();
	
	if(degree)
	{
		System.out.println("Congratulations");
		System.out.println("what is your GPA score");
		
		double gpa=scanner.nextDouble();
		if(gpa>=3.5) 
		if(degree) {
			
			System.out.println("You are eligible for scholorship");

		}else
		{
			System.out.println("You should have studie harder");
		}else{
			System.out.println("You should get a degree");
		}

		 
		{
		}
	}
	}
		
			
		
			

			
		
		
		
		
	
		
		
	

}

