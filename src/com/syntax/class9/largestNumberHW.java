package com.syntax.class9;

public class largestNumberHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 10, 4000, -3000, 4000, 50,  };

        int largestnum= num[0];
        for (int number : num) {
            if (number > largestnum) {
                largestnum = number;
            }
        }
        System.out.println(largestnum);
       
        System.out.println("********************");
       

   
	}
}
