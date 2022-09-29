package ReviewClass;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method  if if the outcomes are 
		
		
		/*
		 * if we need one outcome based on if conditions  we use
		 * two we use if else if outcomes
		 */

		int number = 12;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

        }
//***********************************Second program**************************************************************

        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }
	}

}
