package com.syntax.class8;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<15; i++) {
			
			if(i==3) {
				continue;
				
			}
			
			
			System.out.println("Hello");
			System.out.println("How are you");
			System.out.println("i");
       }

//I want to print numbers from 1 to 20. Dont want to print 3,7, and 11. 
	    
		//continue - continues to the next iteration/cycle
        // moment Java sees continue -> it goes back to the beginning of the loop
        //it usually used inside some type of conditions
		
		for(int  i = 1; i<=20; i++) {
			
			if(i==3 || i==7|| i==11) {
				continue;
			}
			System.out.println( i + " ");
		}
}
}
