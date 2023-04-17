package com.technicaltasks.java;

class CustomException extends Exception {
	String customMessage;

	CustomException(String string) {
		customMessage = string;
	}

	public String toString() {
		return ("Custom Exception is : " + customMessage);
	}
}

public class CustomExceptions {

	public static void main(String[] args) {

		try {
			throw new CustomException("This is a custom exception message");
		} catch (CustomException e) {
			System.out.println(e);
		}

	}

}
