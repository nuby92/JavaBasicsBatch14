package com.syntax.class12;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr = {

	                { 10, 9, 10, 20 }, { 23, 30, 54 }, { 21, 30 } };

	        int sum = 0;

	        for (int[] ar : arr) {

	            for (int num : ar) {
	                if(num%2==0) {
	                    System.out.println(num);
	                }

	            }

	        }
	}

}
