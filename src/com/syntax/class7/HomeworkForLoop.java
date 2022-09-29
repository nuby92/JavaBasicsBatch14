package com.syntax.class7;

import java.util.Scanner;

public class HomeworkForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner input =new Scanner(System.in);
		for(int i=1; i <=3; i++) {
			String name=input.nextLine();
			
			System.out.println("Good afternoon " + name);
			
		}
	}

}
