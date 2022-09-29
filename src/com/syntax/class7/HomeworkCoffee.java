package com.syntax.class7;

import java.util.Scanner;

public class HomeworkCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 2.85;
        double user=0.0;
        Scanner in= new Scanner(System.in);

        //Scanner in= new Scanner(System.in);
        //System.out.println("Please pay for the cofee");
        //user= in.nextDouble();
        do {

            System.out.println("Please pay for the cofee");
           
            if(user>price) {
            System.out.println("Please give lesser price");
          
            }else if(user<price){
                System.out.println("Please give more price");
            
            }
        }while(user!=price);

        System.out.println("Please enjoy your coffee");
		
	}

}
