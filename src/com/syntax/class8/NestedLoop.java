package com.syntax.class8;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int N =1; N<=3; N++) {  //outer loop controls inner loop
			
			System.out.println("Hello");
			
			for(int D = 1; D<=3; D++) { //inner loop depends on outer loop
				System.out.println("Bye");
			}
			System.out.println("-------------------------------");
			
			for(int z =0; z<=2; z++) {
				
				for(int B =1; B<=4; B++) {
					System.out.println(z + " " +B);
				}
				System.out.println("End of the code");
			}
		}
	}

}
