package org.day4;

public class NestedForLoop1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = i + 1; j <= i; j++) {
				System.out.println(j);
		 }
		}
	}


}