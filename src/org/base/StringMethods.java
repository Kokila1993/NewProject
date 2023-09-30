package org.base;

public class StringMethods {
	public static void main(String[] args) {
		String s = "Welcome to Java Class";
		
		String s1 = "welcome to java class";
		
		int length = s.length();
		System.out.println(length);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		char charAt = s.charAt(3);
		System.out.println(charAt);
		
		int indexOf = s.indexOf("J");
		System.out.println(indexOf);
		
		int indexOf1 = s.indexOf("u");
		System.out.println(indexOf1);
		
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		
		boolean endsWith = s.endsWith("ss");
		System.out.println(endsWith);
		
		boolean startsWith = s.startsWith("Welcome");
		System.out.println(startsWith);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean contains = s.contains("to");
		System.out.println(contains);
		
		String replace = s.replace("s", "$");
		System.out.println(replace);
		
		String replaceAll = s.replaceAll("Java", "Selenium");
		System.out.println(replaceAll);
		
		String concat = s1.concat(s);
		System.out.println(concat);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s);
		System.out.println(equalsIgnoreCase);
		
		boolean equals = s1.equals(s);
		System.out.println(equals);
		
		}

}
