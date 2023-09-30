package org.day4;

public class CountOfEven {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 0; i < 100; i++) {

			if (i % 2 == 0) {

				count++;

			}

		}

		System.out.println("Count of Even numbers:" + count);

		// int a = 0;
		//
		// for (int i = 1; i <= 100; i++) {
		//
		// a = a+1;
		// i++;
		//
		// }
		//
		// System.out.println("The Count of Even numbers are:"+a);

	}

}
