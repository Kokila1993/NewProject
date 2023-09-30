package org.base;

public class LadderIf {
	
	public static void main(String[] args) {
		
		int a = 30; int b = 50; int c = 25;
		
		if (a>b && a>c) {
			
			System.out.println("a is the greatest value");
			
		} else if (b>a && b>c) {
			
			System.out.println("b is the greatest value");
			
		} else if (c>a && c<b) {
			
			System.out.println("c is the greatest value");
			
		}

		}
	}


