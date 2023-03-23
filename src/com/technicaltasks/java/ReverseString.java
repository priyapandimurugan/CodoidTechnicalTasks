package com.technicaltasks.java;

public class ReverseString {

	public static void main(String[] args) {

		String string = "Programming";
		System.out.println("Before reverse string: " + string);

		System.out.print("After reversed string: ");

// Recursive function calling
		reverseString(string);
	}

	static void reverseString(String string) {

		if ((string == null) || (string.length() <= 1))
			System.out.println(string);
		else {
			System.out.print(string.charAt(string.length() - 1));
			reverseString(string.substring(0, string.length() - 1));
		}
	}
}
