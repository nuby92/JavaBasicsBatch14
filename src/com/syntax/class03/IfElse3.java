package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isHungry=true;
		
		if (isHungry) {
			System.out.println("Lets eat something yummy");
			
			if(3>2)
				System.out.println("There is a true statement inside paranthesis");
			double myBankbalance=2000;
			double theAmountThatIwantToTransfer=2500;
			if(myBankbalance>theAmountThatIwantToTransfer)
				System.out.println("Funds transfered succesfuly");
			else
				System.out.println("Please try again not enough balance");
		}
	}

}
