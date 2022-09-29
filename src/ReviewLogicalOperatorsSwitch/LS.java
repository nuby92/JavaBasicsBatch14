package ReviewLogicalOperatorsSwitch;

import java.util.Scanner;

public class LS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner("System.in");
		  System.out.println("Please enter two strings and " + " Two numbers");
		  
		  int num1=scanner.nextInt();
		  int num2=scanner.nextInt();
		   String word1= scanner.nextLine();
		    String word2= scanner.next();
		  
		  if(num1==0 && num2==0 && (word1).equals (word2)) {
		   System.out.println("AND");
		    
		}else if(num1==num2 || (word1).equals(word2)); {
		    System.out.println("OR");  
		} 
		        System.out.println("NONE");  

		} 
		  {
		}
	

	}


