package com.technicaltasks.java;

import java.util.ArrayList;

public class ArrayToString {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("Selenium");
		arrayList.add("TestNG");
		arrayList.add("Cucumber");

		String listString = "";

		for (String string : arrayList) {
			listString += string + "\t";
		}

		System.out.println(listString);

	}

}
