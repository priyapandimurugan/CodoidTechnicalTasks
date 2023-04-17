package com.technicaltasks.java;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		String dataWithSpecialCharacters = "my#*J(av$$a&";
		String removedSpecialCharacters = dataWithSpecialCharacters.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println("Data with Special Characters: " + dataWithSpecialCharacters);
		System.out.println("Data removed Special Characters: " + removedSpecialCharacters);

	}

}
