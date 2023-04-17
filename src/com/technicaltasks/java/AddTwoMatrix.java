package com.technicaltasks.java;

public class AddTwoMatrix {

	public static void main(String[] args) {
		 
		int a[][] = { { 1, 2, 3 }, { 4, 3, 2 }, { 5, 1, 2 } };

		int b[][] = { { 3, 2, 1 }, { 5, 4, 3 }, { 4, 3, 2 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				c[i][j] = a[i][j] + b[i][j];

				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}

		

	}

}
