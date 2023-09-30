package org.base;

public class Static {
	int a=10;
	static int b=30;
	
	private void empId() {
		System.out.println("instance variable:"+a);
		System.out.println("static variable:"+b);
		a++;
		b++;
		System.out.println("instance variable:"+a);
		System.out.println("static variable:"+b);
	}
	public static void main(String[] args) {
		Static i = new Static();
		i.empId();
		Static t=new Static();
		t.empId();
	}

}
