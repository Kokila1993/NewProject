package org.login;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeDetails {
	public static void main(String[] args) {
		int a[]=new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=10;
		a[3]=30;
		a[4]=40;
		
		System.out.println(a[4]);
		System.out.println("array output");
		for (int i = 0; i <  5; i++) {
			System.out.println(a[i]);
			
		}
		
		Set<Integer> s = new LinkedHashSet<>();
		 s.add(a[0]);
		 s.add(a[1]);
		 s.add(a[2]);
		 s.add(a[3]);
		 s.add(a[4]);
		 
		 
		 System.out.println("set output without duplicate ");
		System.out.println(s);
		 
		
	}

}
