package com.syntax.class7;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a=50;
		while(a>=20) {
			
			System.out.println(a+" ");
			a--;
		
			System.out.println("Another way");
			
			int b=2;
			while(b>=20) {
				
				System.out.println(b +" ");
				a+=2;
		}
			System.out.println("Another way");
			int e=1;
			
			while(e<=20) {
				if(e%2==0) {
					System.out.println(e + " ");
				}
				e++;
			}
	}	
		
}
}



