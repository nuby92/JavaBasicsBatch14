package com.syntax.class10;

public class TwoDArrayLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array (longer way)where you will store the
		//following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String [][] bigArray=new String[2][4];
		   
		  bigArray[0][0]="Mr";
	      bigArray[0][1]="Mrs";
	      bigArray[0][2]="Ms";
	      bigArray[0][3]="Miss";
	      
	      bigArray[1][0]="Smith";
	      bigArray[1][1]="Jordan";
	      bigArray[1][2]="Jackson";
	      bigArray[1][3]="Obama";
	    
	      System.out.println(bigArray[0][1]+" "+bigArray[1][0]+", "+bigArray[0][0]+" "+bigArray[1][3]+", "+bigArray[0][2]+" "+bigArray[1][2]+", "+bigArray[0][3]+" "
	      +bigArray[1][1]);

	}

}
