package org.base;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(20);
		li.add(30);
		
		System.out.println(li);
		
		Set<Integer> s = new LinkedHashSet<>();
		System.out.println(s);
		
//		To all values list to set
		s.addAll(li);
		System.out.println(s);
		
//		To add the values to list
		li.add(90);
		li.add(80);
		li.add(70);
		System.out.println(li);
		
//		To get common values
		li.retainAll(s);
		System.out.println(li);

//		To remove common values
		li.remove(s);
		System.out.println(li);
		
	}

}
