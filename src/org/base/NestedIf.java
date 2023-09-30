package org.base;

public class NestedIf {
	
	public static void main(String[] args) {
		
		int age = 80;
		
		if (age>=18) {
			
			if (age<=60) {
				
				System.out.println("Eligible to Attend the Class:");
			} else {
				
				System.out.println("Over Eligible to Attend the Class:");
			}
			
		} else {
			
				System.out.println("Non Eligible to Attend the Class:");
		}
			
	}
			
}