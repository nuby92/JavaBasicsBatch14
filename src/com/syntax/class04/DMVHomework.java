package com.syntax.class04;

import java.util.Scanner;

public class DMVHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner=new Scanner (System.in);
 System.out.println("How old are you");
 
 int age=scanner.nextInt();
 if (age>=18) {
	 System.out.println("Congratulations you will get your driver permit");
 }else {
	 System.out.println("You should get learners permit");
 }
	}

}
