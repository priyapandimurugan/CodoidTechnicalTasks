package com.technicaltasks.java;

public class NumericalTriangle {

	public static void main(String[] args) {

		formNumericalTriangle(7);

	}

	public static void formNumericalTriangle(int triangleSize) {

		for (int i = 1; i <= triangleSize; i++) {

			System.out.print("* ");
			for (int j = 1; j <= i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
	}
}
