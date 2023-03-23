package com.technicaltasks.java;

public class CheckEvenOddNumber {

	public static void main(String[] args) {

		identifyEvenOddNumber(2);
	}

	public static void identifyEvenOddNumber(int inputNumber) {

		if (inputNumber % 2 == 0)
			System.out.println(inputNumber + " is an even number");
		else
			System.out.println(inputNumber + " is an odd number");

	}
}
