package com.technicaltasks.java;

import java.lang.reflect.Method;

public class GetName {

	public static void main(String[] args) {

		Class className = GetName.class;
		Method[] methods = className.getMethods();

		for (Method method : methods) {

			// getName() getting name of all the methods in this class
			String methodName = method.getName();
			System.out.println("Method name is: " + methodName);
		}

		// getName() getting name of the class
		String classFullName = className.getName();
		System.out.println("Class full name is: " + classFullName);

	}

	/**
	 * Method
	 */
	public static void loginPage() {

		System.out.println("I am in Login Page");
	}

}
