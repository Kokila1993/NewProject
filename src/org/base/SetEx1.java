package org.base;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx1 {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new LinkedHashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(10);
		s.add(60);
		
//		To find the length of the set
		int size = s.size();
		System.out.println(size);
		
//		To find the values of set
		System.out.println(s);
		
//		To remove the particular value
		s.remove(30);
		System.out.println(s);
		
//		To check whether Set is empty
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
//		To check whether the value is present 
		boolean contains = s.contains(10);
		System.out.println(contains);
		
//		To iterate values of set
		
		System.out.println("*****FOR EACH Loop******");
		for (Integer x : s) {
			System.out.println(x);
			
		}
		
	}

}
