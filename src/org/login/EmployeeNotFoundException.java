package org.login;

public class EmployeeNotFoundException extends Exception {
	
	public String getMessage () {
		
		String errorMessage = "Given Employee ID is not found in our data base";
		
		return errorMessage;
		
		
	}

}
