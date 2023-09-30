package org.base;

import java.util.LinkedList;
import java.util.List;

public class Generic {
	
	public static void main(String[] args) {
		
		List<Integer> li = new LinkedList<Integer>();
		
		System.out.println(li);
		
		boolean empty = li.isEmpty();
		System.out.println(empty);
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(10);
		li.add(60);
		System.out.println(li);
		
//		To check list is empty
		boolean empty1 = li.isEmpty();
		System.out.println(empty1);
		
//		To find the length of the list
		int size = li.size();
		System.out.println(size);
		
//		To get the particular value from the list
		Integer integer = li.get(6);
		System.out.println(integer);
		
//		To remove a particular value from list
		li.remove(4);
		System.out.println(li);
		
//		index based add
		li.add(2,200);
		System.out.println(li);
		
//		Replace the value
		li.set(1, 100);
		System.out.println(li);
		
//		To check whether the value is present
		boolean contains = li.contains(200);
		System.out.println(contains);
		
//		To find the index position of the value
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
//		To find last index of the value
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		int indexOf2 = li.indexOf(1000);
		System.out.println(indexOf2);
		
		System.out.println("***** FOR LOOP*****");
		
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i));
			
		}
		
		System.out.println("***** FOREACH LOOP*****");
		
		
		for (Integer x : li) {
			
			System.out.println(x);
			
		}
		
		
		
		
	}

}
