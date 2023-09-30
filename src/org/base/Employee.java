package org.base;

import java.util.LinkedList;
import java.util.List;

public class Employee {
	
	public static void main(String[] args) {
		
		List li = new LinkedList();
		System.out.println(li);
		
		boolean empty = li.isEmpty();
		System.out.println(empty);
		
		li.add(10);
		li.add("Java");
		li.add(6754.767456f);
		li.add(9080866807l);
		li.add("Selenium");
		li.add(10);
		li.add("false");
		
		System.out.println(li);
		
		//to check whether list is empty
		boolean empty2 = li.isEmpty();
		System.out.println(empty2);
		
		//to find the length of the list
		int size = li.size();
		System.out.println(size);
		
		//value for a given index
		Object object = li.get(6);
		System.out.println(object);
		
		//remove the particular value
		li.remove(4);
		System.out.println(li);
		
		//index based add
		li.add(6," true");
		System.out.println(li);
		
		//replace the value
		li.set(3,"9751987116");
		System.out.println(li);
		
		//to check the value is present or not
		boolean contains = li.contains("Selenium");
		System.out.println(contains);
		
		//to find the index position of particular value
		int indexOf = li.indexOf(10);
		System.out.println(indexOf);
		
		//to find last index position of particular value
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		int indexOf2 = li.indexOf(987);
		System.out.println(indexOf2);
		
		System.out.println("******For loop******");
		for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i));
		}
		System.out.println("******Foreach loop******");
		for (Object x : li) {
			System.out.println(x);
		}
		
	}
}
