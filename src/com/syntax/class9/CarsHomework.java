package com.syntax.class9;

public class CarsHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		
		String[] carsType = {"Audi", "Honda", "Toyota", "Mecedes", "Nissan", "Jeep"};
		
		System.out.println(carsType[0] +" ");
		
        for(int i=0; i<carsType.length; i++) {
			
			System.out.print(carsType[i]+" ");
		}
        System.out.println("*************************");
        
        for(String num:carsType) {
			System.out.print(num+" ");
	}

}
}
