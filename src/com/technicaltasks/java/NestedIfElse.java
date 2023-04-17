package com.technicaltasks.java;

public class NestedIfElse {

	public static void main(String[] args) {

		// Creating two variables for age and weight
		int maths = 80;
		int science = 85;

		// Applying conditions using nested if else
		if (maths >= 75) {
			if (science > 80) {
				System.out.println("You are eligible for the Job criteria");
			} else {
				System.out.println("You are not eligible for the Job criteria");
			}
		} else {
			System.out.println("Score much be greater than 70");
		}

	}

}
