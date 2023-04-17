package com.technicaltasks.java;

public class PalindromeIdentification {

	public void isStringPalindrome(String stringValue) {

		String reverseString = "";

		int strLength = stringValue.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseString = reverseString + stringValue.charAt(i);
		}

		if (stringValue.toLowerCase().equals(reverseString.toLowerCase())) {
			System.out.println("'" + stringValue + "' is a Palindrome string");
		} else {
			System.out.println("'" + stringValue + "' is not a Palindrome string");
		}

	}

	public void isNumberPalindrome(int numberValue) {

		int reversedNumber = 0, remainder;

		// store the number to originalNumber
		int originalNumber = numberValue;

		// get the reverse of originalNumber
		while (numberValue != 0) {
			remainder = numberValue % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			numberValue /= 10;
		}

		// check if reversedNumber and originalNumber are equal
		if (originalNumber == reversedNumber) {
			System.out.println(originalNumber + " is Palindrome number");
		} else {
			System.out.println(originalNumber + " is not Palindrome number");
		}
	}
	
	

	public static void main(String[] args) {

		PalindromeIdentification palindromeIdentification = new PalindromeIdentification();

		palindromeIdentification.isStringPalindrome("Radar");
		palindromeIdentification.isNumberPalindrome(121);

	}

}
