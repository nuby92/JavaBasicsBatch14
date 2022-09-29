package com.syntax.class04;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		System.out.println("What is the amount of the loan is needed");

		double loan=scanner.nextDouble();
		if(loan<=200000) {
			System.out.println("Congrats, I can lend you money");
		}else {
			System.out.println("Sorry, I cannot lend you money");
		}
		}

		
	}


