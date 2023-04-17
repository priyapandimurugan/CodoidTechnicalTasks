package com.technicaltasks.java;

public class FibonacciSeries {
	
	

	public static void main(String[] args) {

		makeFibonacciSeries(10, 0, 1);
	}
	
	public static void makeFibonacciSeries(int numberTill, int firstTerm, int secondTerm) {
		
		int i=1;
		
		System.out.println("FibonacciSeries till " + numberTill + ": ");

		while (i <= numberTill) {
			System.out.print(firstTerm + ", ");

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			i++;
		}
		
	}
}
