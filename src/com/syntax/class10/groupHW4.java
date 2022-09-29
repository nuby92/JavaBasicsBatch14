package com.syntax.class10;

public class groupHW4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Create a 2D array or integer type where you will store
       //odd and even numbers. Develop a program which will
       //identify/print the even numbers only.
		
		int [] [] array= {
				
				{9,8,10,11,12,20,30,40,60},
				{80,81,100,110,120},
				{1,3,5,11,15,23}
				};
		 for(int r=0; r<array.length; r++) {
			 
     for(int c=0; c<array[r].length;c++) {
   	  
   	  if(array[r][c]%2 == 0)
   	  
   	  System.out.print(array[r][c]+" ");
     }
    
     
   	  
     }
			 
	}
}
