package com.syntax.class04;

import java.util.Scanner;

public class TemperatureaaHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       System.out.println("Please enter your city");
       
       String city=scanner.next();
       
       System.out.println("Please enter the temperature (F)in your city");
       
       float temperatureF=scanner.nextFloat();
       float temperatureC=(temperatureF-32)*5/9;
       
       System.out.println("The temprature in " +city+ " is "  +temperatureC+ " C ");
       
	}

}
