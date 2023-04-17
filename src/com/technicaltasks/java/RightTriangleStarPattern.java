package com.technicaltasks.java;

public class RightTriangleStarPattern {
	
	
	
	

	public static void main(String args[]) {

		rightSideTriangle(6);
	}
	
	
	
	
	
	

	public static void rightSideTriangle(int triangleRowSize) {

		// i for rows
		// j for columns
		// row denotes the number of rows
		int i, j, row = triangleRowSize;

		// outer loop for rows
		for (i = 0; i < row; i++) {
			// inner loop for columns
			for (j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
