package com.syntax.class13;

public class Person {

	String name; 
	int age;
	double waight;
	boolean isFunny;
	double height;
	boolean losinghair;
	
	void study() {
		
		if (name.equals("Anna")) {
System.out.println("I study hard");
		}else if (name.equals("Roma")) {
	System.out.println("I will keep deleting the messeges and will not let anyone study ");
		}else {
			System.out.println("I try to study but things dont make much same");
		}
	}
	
	public static void main(String[] args) {
		Person person1=new Person();
		person1.name="Roma";
		person1.study();
		
		System.out.println("********************************************");
		Person person2=new Person();
		person2.name="Yufut";
		person2.study();


}
	}

