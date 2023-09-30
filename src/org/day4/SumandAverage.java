package org.day4;

public class SumandAverage {
	
	public static void main(String[] args) {
		
	int sum=0;
	int c=0;
	int average;
	
	for (int i = 10; i <= 30; i++) {
		
		if (i%2 != 0) {
			
			System.out.println(i);
			
			sum=sum+i;
			
			c++;
			
		}
	}
	
	average = sum/c;
	
	System.out.println("Sum of ODD number:"+sum +"\nAverage of ODD numbers:"+average);
	}

}
