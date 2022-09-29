package Class5;

import java.util.Scanner;

public class HomeworkCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);

        System.out.println("Do you have a creadt card?");

        String hasCreditCard=Scanner.nextLine(); 
        boolean hasNoCreaditCard = false;

        if(hasNoCreaditCard) {

        System.out.println("Would you like to apply for a credit card?");

        }else {
            System.out.println("what is balance on the card?");
        }

        String balance=Scanner.nextLine();

        int balanceAmount=1000;


        if (balanceAmount>=1000) {
        System.out.println("You should pay your balance immediately");

        }else  {
            System.out.println("You can spend more!");
        }
		
	}

}
