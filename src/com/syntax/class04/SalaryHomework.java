package com.syntax.class04;

import java.util.Scanner;

public class SalaryHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner (System.in);

System.out.println("Please enter number of worked years");

  int workedYears=scanner.nextInt();
 
  if (workedYears>=5) {
 
	 System.out.println("What is your anual salary");
	 
  double annualSalary=scanner.nextDouble();
 
  if( annualSalary>50000); {
	 System.out.println("Your bonus is 5000");
	 
  }
  
  {
		
	}
}else {
	System.out.println("You are not eligible for the bonus");
	}
}
}