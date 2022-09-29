package com.syntax.class8;

public class NestedLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		for (int a=0; a<=9; a++) {
			
			for ( int b=0; b<=9; b++) {
				
				for ( int c=0; c<=9; c++) {
					System.out.println(a+ " " +b+ " " + c);
				} 
					

				   System.out.println(" -----------------------------  ");

			        for(int i=0; i<=2; i++) {

			            for(int j=1; j<4; j++) {

			                System.out.println(i+" X "+i * j);

			            }
			        }

			    }
			}
			}
		
	}


