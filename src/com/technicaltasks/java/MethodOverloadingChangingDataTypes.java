package com.technicaltasks.java;

public class MethodOverloadingChangingDataTypes {

	public static void main(String[] args) {
		display(15);
		display("My Java");
	}

	// Method accepts int
	private static void display(int a) {
		System.out.println("Got integer value");
	}

	// Method accepts string
	private static void display(String a) {
		System.out.println("Got string value");
	}

}
