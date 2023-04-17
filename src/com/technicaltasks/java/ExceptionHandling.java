package com.technicaltasks.java;

public class ExceptionHandling {

	public static void main(String[] args) {
		int i = 100;
		int j = 0;
		int data;
		
		

		try {

			data = i / j;

		} catch (Exception e) {

			System.out.println(i / (j + 2));
			System.out.println(e);
		}

		finally {
			System.out.println("the value is 25");
		}


	}

}
