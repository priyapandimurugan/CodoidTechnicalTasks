package com.technicaltasks.java;

public class MethodOverloadingChangingArguments {

	public static void main(String[] args) {
		argumentData(16);
		argumentData(10, 14);
	}
	
	private static void argumentData(int a) {
		System.out.println("Argument is: " + a);
	}

	private static void argumentData(int a, int b) {
		System.out.println("Arguments are: " + a + " and " + b);
	}


}
