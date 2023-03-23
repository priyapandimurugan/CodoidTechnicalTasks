package com.technicaltasks.java;

public class ReplaceBetweenTwoStrings {

	public static void main(String[] args) {

		replaceStringValue("Vishwa", "Priya");

	}

	public static void replaceStringValue(String firstString, String secondString) {

		// Strings before replacing...
		System.out.println("\nStrings before replacing:");
		System.out.println("FirstString: " + firstString + "\nSecondString: " + secondString);

		// Replacing string firstString with secondString
		firstString = firstString.replace(firstString, secondString);

		// Strings after replacing...
		System.out.println("\nStrings after replaced:");
		System.out.println("FirstString: " + firstString + "\nSecondString: " + secondString);

	}

}
