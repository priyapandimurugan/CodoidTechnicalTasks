package com.technicaltasks.java;

public class MethodsInJava {

	public static void main(String[] args) {

		MethodsInJava methods = new MethodsInJava();

		System.out.println("Integer Method:" + methods.sumOfTwoNumbers(5, 15));
		System.out.println("String Method:" + methods.myLoginPage("Hello Login Page"));
		System.out.println("Char Method:" + methods.charMethod('a'));
		System.out.println("Double Method:" + methods.sumOfTwoDecimals(1.5, 1.5));
		System.out.println("Boolean Method:" + methods.booleanMethod(2, 5));
		methods.myVoidMethod();

	}

	public int sumOfTwoNumbers(int firstNumber, int secondName) {

		int result = firstNumber + secondName;
		return result;

	}

	public String myLoginPage(String stringValue) {

		return stringValue;
	}

	public void myVoidMethod() {

		System.out.println("Void Method: Hello void method.");

	}

	public double sumOfTwoDecimals(double firstDecimal, double secondDecimal) {

		double result = firstDecimal + secondDecimal;
		return result;

	}

	public char charMethod(char value) {

		return value;

	}

	public boolean booleanMethod(int firstNumber, int SecondNumber) {

		boolean result = firstNumber > SecondNumber;
		return result;

	}

}
