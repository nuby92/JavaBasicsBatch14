package com.syntax.class7;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// from the range of 1 to 50
		//please find the sum of all even and all odd number
		
		int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
        System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
		}
}

