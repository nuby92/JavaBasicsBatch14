package com.syntax.class14;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*tore username, password and confirm password from a user and check following requirements:
		 * Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
*Password should be minimum 8 characters, if less → message=”Password is too short”.
*Password cannot contain username if so, → message=”Password cannot contain username”.
*Password should match confirmed password, if not  → message=“Passwords do not match”.
*Only after all requirements met → message “Your username and password has been created”
		 */
		
		String userName="user1";
		String password="pass123";
		String confirmPassword="pass123";
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		 }else if(password.length()<8) {
	            System.out.println("Password is too short");
	            
	        }else if(password.contains(userName)) {
	        	
	            System.out.println("Password cannot contain username");

	        	
	        }else if(!password.equals(confirmPassword)) {
	        	System.out.println("Passwords do not match");
	        	
	        }else {
	        	System.out.println("Your username and password has been created");
	        }
	}
}
