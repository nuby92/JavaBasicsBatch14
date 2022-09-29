package com.syntax.class11;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] dresses=new String[] {"Pink Dress","cocktail","Summer Dress","Night Dress"
                ,"Pencil Dress"};
        //last index is always size-1 because arrays
        // index start from zero
        System.out.println(dresses.length);

        for(int i=0;i<dresses.length;i++) {
            System.out.println("Lets try "+dresses[i]);
        }
        //enhance for loop 
        for(String dress:dresses) {
        	System.out.println(dress);
        }

        System.out.println("***");
        // prints all the elements of an array without a loop
        System.out.println(Arrays.toString(dresses));
	}

}
