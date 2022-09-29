package com.syntax.class6;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String seasonBorn = "January";

		String month = scan.nextLine();

		if (month.equals("December") || month.equals("January") || month.equals("February")) {
			seasonBorn= "Winter";

		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			seasonBorn = "Spring";

		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			seasonBorn = "Summer";

		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			seasonBorn= "fall";

			System.out.println("You were born is season " + seasonBorn);
		}

	}

}
