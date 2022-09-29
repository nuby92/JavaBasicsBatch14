package com.syntax.class04;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner (System.in);
    System.out.println("Please enter your mortgage rate");
    
    double mortgageRate=scanner.nextDouble();
    
    if (mortgageRate<4.5) {
    	Scanner Price =new Scanner (System.in);
    	
    	System.out.println("Please enter mortgage rate");
    	
    	double mortgagePrice=scanner .nextDouble(); 
    	
    	if (mortgagePrice<200000) {
    		
    		System.out.println("You should take a loan");
    		
    	}else {
    		
    		System.out.println("You should pay cash");
    	}
    }else {
    	System.out.println("You cannot buy a house");
    	}
    }
	}


