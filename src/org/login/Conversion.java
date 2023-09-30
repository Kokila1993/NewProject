package org.login;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Conversion {
	public static void main(String[] args) {
		
		int a[]=new int [3];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a[0]);
		
		System.out.println("Array");
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
			
		}
		
		List<Integer> l = new LinkedList<Integer>();
		
		l.add(a[0]);
		l.add(a[1]);
		l.add(a[2]);
		
		System.out.println("List"+l);
		
		Set<Integer> s = new LinkedHashSet<>();
		s.addAll(l);
		
		
		System.out.println("Set"+s);
		
		Map<Integer,String >m=new LinkedHashMap<>();
	m.put(10,null);
	m.put(20, null);
	m.put(30, null);
	System.out.println("map"+m);
	
		
	} 

}
