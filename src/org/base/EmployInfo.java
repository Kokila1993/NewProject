package org.base;

public class EmployInfo {
	int age;
	
	private void empId() {
		age=80;
				
	}
	public static void main(String[] args) {
		EmployInfo u = new EmployInfo();
		System.out.println("before initialization:"+u.age);
		
		u.empId();
		System.out.println("after initialization:"+u.age);
		
		
		
	}

}
